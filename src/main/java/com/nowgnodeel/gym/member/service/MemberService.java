package com.nowgnodeel.gym.member.service;

import com.nowgnodeel.gym.member.common.MemberDTO;
import com.nowgnodeel.gym.member.domain.Member;
import com.nowgnodeel.gym.member.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
  private final MemberRepository memberRepository;

  @Transactional
  public List<Member> getMemberList() {
    return memberRepository.findAll();
  }

  @Transactional
  public void createMember(MemberDTO dto) {
    if (memberRepository.findByNickname(dto.nickname()) != null) {
      throw new IllegalStateException("이미 있는 회원입니다.");
    } else {
      memberRepository.save(dto.toEntity());
    }
  }

  @Transactional
  public void removeMember(Long id) {
    memberRepository.deleteById(id);
  }

  @Transactional
  public void updateMember(Long id, MemberDTO dto) {
    Optional<Member> optionalMember = memberRepository.findById(id);
    if (optionalMember.isEmpty()) return;
    Member member = optionalMember.get();
    member.setNickname(dto.nickname());
    member.setBirth(dto.birth());
    member.setSex(dto.sex());
    member.setPhone(dto.phone());
    member.setAddress(dto.address());
    memberRepository.save(member);
  }
}
