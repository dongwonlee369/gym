package com.nowgnodeel.gym.trainer.domain;

import com.nowgnodeel.gym.global.domain.BaseTimeEntity;
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
public class TrainerLicense extends BaseTimeEntity {

  @ToString.Exclude
  @ManyToOne(fetch = FetchType.LAZY)
  private Trainer trainer;

  @Embedded
  private License license;
}
