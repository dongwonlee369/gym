package com.nowgnodeel.gym.member.controller;

import com.nowgnodeel.gym.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {
  private final MemberService memberService;

  /* 관리자 회원 리스트 보기 */
  @GetMapping("/")
  public String getMemberList(Model model) {
    model.addAttribute("memberLists", memberService.getMemberList());
    return "";
  }
}
