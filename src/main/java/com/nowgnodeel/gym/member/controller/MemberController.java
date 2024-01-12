package com.nowgnodeel.gym.member.controller;

import com.nowgnodeel.gym.member.common.MemberDTO;
import com.nowgnodeel.gym.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {
  private final MemberService memberService;

  /* 관리자 회원 리스트 보기 */
  @GetMapping("")
  public String getMemberList(Model model) {
    model.addAttribute("memberLists", memberService.getMemberList());
    return "admins/memberManagement";
  }

  @PostMapping
  public String createMember(MemberDTO dto) {
    memberService.createMember(dto);
    return "redirect:/members";
  }

  @PostMapping("/remove")
  public String removeMember(@RequestParam("memberId") Long id) {
    memberService.removeMember(id);
    return "redirect:/members";
  }
}
