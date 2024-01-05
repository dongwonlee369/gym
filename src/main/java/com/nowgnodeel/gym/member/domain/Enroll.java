package com.nowgnodeel.gym.member.domain;

import com.nowgnodeel.gym.global.domain.BaseTimeEntity;
import com.nowgnodeel.gym.global.domain.Membership;
import com.nowgnodeel.gym.global.domain.PaymentType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Enroll extends BaseTimeEntity {

  private boolean gymWear;

  private boolean locker;

  private PaymentType paymentType;

  @ToString.Exclude
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
  private Member member;

  @ToString.Exclude
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
  private Membership membership;
}
