package com.nowgnodeel.gym.trainer.common;

import com.nowgnodeel.gym.global.domain.Sex;
import com.nowgnodeel.gym.trainer.domain.Trainer;

public record TrainerDTO(
    String nickname,
    String birth,
    Sex sex,
    String phone,
    String address
) {
  public Trainer toEntity() {
    return Trainer.builder()
        .nickname(nickname)
        .birth(birth)
        .sex(sex)
        .phone(phone)
        .address(address)
        .build();
  }
}
