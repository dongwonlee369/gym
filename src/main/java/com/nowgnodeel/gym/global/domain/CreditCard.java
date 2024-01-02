package com.nowgnodeel.gym.global.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class CreditCard {

  @Column(nullable = false)
  private String creditCardNumber;

  @Column(nullable = false)
  private String creditCardExpireAt;

  @Column(nullable = false)
  private String creditCardCvc;
}
