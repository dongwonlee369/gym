package com.nowgnodeel.gym.member.common;

import com.nowgnodeel.gym.global.domain.Sex;
import com.nowgnodeel.gym.member.domain.Member;

public record MemberDTO(
    /*String username,
    String password,*/
    String nickname,
    String birth,
    Sex sex,
    String phone,
    String address
) {
  public Member toEntity() {
    return Member.builder()
        /*.username(username)
        .password(password)*/
        .nickname(nickname)
        .birth(birth)
        .sex(sex)
        .phone(phone)
        .address(address)
        .build();
  }
}
