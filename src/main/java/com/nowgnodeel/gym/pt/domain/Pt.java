package com.nowgnodeel.gym.pt.domain;

import com.nowgnodeel.gym.global.domain.BaseTimeEntity;
import com.nowgnodeel.gym.global.domain.PaymentType;
import com.nowgnodeel.gym.member.domain.Member;
import com.nowgnodeel.gym.trainer.domain.Trainer;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Pt extends BaseTimeEntity {

  @Column(nullable = false)
  private String cost;

  @Column(nullable = false)
  private String count;

  /*@Column(nullable = false)
  private String totalCost;*/

  @Column(nullable = false)
  private PaymentType paymentType;

  @ToString.Exclude
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
  private Member member;

  @ToString.Exclude
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
  private Trainer trainer;
}
