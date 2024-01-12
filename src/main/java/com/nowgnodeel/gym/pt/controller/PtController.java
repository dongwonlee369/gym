package com.nowgnodeel.gym.pt.controller;

import com.nowgnodeel.gym.member.domain.Member;
import com.nowgnodeel.gym.member.service.MemberService;
import com.nowgnodeel.gym.pt.common.PtDTO;
import com.nowgnodeel.gym.pt.service.PtService;
import com.nowgnodeel.gym.trainer.domain.Trainer;
import com.nowgnodeel.gym.trainer.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/pts")
public class PtController {
  private final PtService ptService;
  private final MemberService memberService;
  private final TrainerService trainerService;

  /* PT 리스트 보기 */
  @GetMapping("")
  public String getPtList(Model model) {
    model.addAttribute("PtLists", ptService.getPtList());
    return "admins/ptManagement";
  }

  @PostMapping
  public String createPt(PtDTO dto, Trainer trainer, Member member) {
    ptService.createPt(trainer, member);
    return "redirect:/pts";
  }
}
