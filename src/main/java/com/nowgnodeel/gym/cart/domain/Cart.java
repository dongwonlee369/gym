package com.nowgnodeel.gym.cart.domain;

import com.nowgnodeel.gym.global.domain.BaseTimeEntity;
import com.nowgnodeel.gym.global.domain.PaymentType;
import com.nowgnodeel.gym.member.domain.Member;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Cart extends BaseTimeEntity {

  @Column(nullable = false)
  private String cartPrice;

  @Column(nullable = false)
  private PaymentType paymentType;

  @ToString.Exclude
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
  private Member member;
}
