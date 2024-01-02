package com.nowgnodeel.gym.member.domain;

import com.nowgnodeel.gym.global.domain.BaseTimeEntity;
import com.nowgnodeel.gym.global.domain.CreditCard;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberCreditCard extends BaseTimeEntity {

  @ToString.Exclude
  @ManyToOne(fetch = FetchType.LAZY)
  private Member member;

  @Embedded
  private CreditCard creditCard;
}
