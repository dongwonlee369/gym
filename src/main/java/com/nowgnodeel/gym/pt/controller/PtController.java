package com.nowgnodeel.gym.pt.controller;

import com.nowgnodeel.gym.member.service.MemberService;
import com.nowgnodeel.gym.pt.common.PtDTO;
import com.nowgnodeel.gym.pt.service.PtService;
import com.nowgnodeel.gym.trainer.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/pts")
public class PtController {
  private final PtService ptService;
  private final TrainerService trainerService;
  private final MemberService memberService;

  /* PT 리스트 보기 */
  @GetMapping("")
  public String getPtList(Model model) {
/*
    이거 주석 처리 하니까 오류 없이 동작은 하는데 DB에 만 값이 입력되고 뷰에서는 값이 출력이 안됨.
    model.addAttribute("ptLists", ptService.getPtList());
*/
    model.addAttribute("trainerLists", trainerService.getTrainerList());
    model.addAttribute("memberLists", memberService.getMemberList());
    return "admins/ptManagement";
  }
  /* 생성 부분 수정 필요 */
  @PostMapping
  public String createPt(PtDTO dto) {
    ptService.createPt(dto);
    return "redirect:/pts";
  }

  @PostMapping("/remove")
  public String removePt(@RequestParam("ptId") Long id) {
    ptService.removePt(id);
    return "redirect:/pts";
  }
}
