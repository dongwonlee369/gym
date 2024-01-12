package com.nowgnodeel.gym.pt.common;

import com.nowgnodeel.gym.global.domain.PaymentType;
import com.nowgnodeel.gym.pt.domain.Pt;

public record PtDTO(
    String cost,
    String count,
    PaymentType paymentType
) {
  public Pt toEntity() {
    return Pt.builder()
        .cost(cost)
        .count(count)
        .paymentType(paymentType)
        .build();
  }
}
