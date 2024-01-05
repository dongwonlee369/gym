package com.nowgnodeel.gym.member.service;

import com.nowgnodeel.gym.member.domain.Member;
import com.nowgnodeel.gym.member.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
  private final MemberRepository memberRepository;

  @Transactional
  public List<Member> getMemberList() {
    return memberRepository.findAll();
  }
}
