package com.nowgnodeel.gym.license.domain;

import com.nowgnodeel.gym.global.domain.BaseTimeEntity;
import com.nowgnodeel.gym.trainer.domain.Trainer;
import jakarta.persistence.*;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Embeddable
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class License extends BaseTimeEntity {

  @Column(nullable = false)
  private String licenseName;

  @Column(nullable = false)
  private String licenseGrade;

  @Column(nullable = false)
  private String licenseEvent;

  @Column(nullable = false)
  private String licenseCreateDate;

  @Column(nullable = false)
  private String licenseExpireDate;

  @ToString.Exclude
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
  private Trainer trainer;
}
