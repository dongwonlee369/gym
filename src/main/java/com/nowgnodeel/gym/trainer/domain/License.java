package com.nowgnodeel.gym.trainer.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import lombok.*;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class License {

  @Column(nullable = false)
  private String licenseName;

  @Column(nullable = false)
  private String licenseGrade;

  @Column(nullable = false)
  private String licenseEvent;

  @Column(nullable = false)
  private String licenseCreateAt;

  @Column(nullable = false)
  private String licenseExpireAt;
}
