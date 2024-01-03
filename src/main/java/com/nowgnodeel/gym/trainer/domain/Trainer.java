package com.nowgnodeel.gym.trainer.domain;

import com.nowgnodeel.gym.global.domain.BaseTimeEntity;
import com.nowgnodeel.gym.global.domain.Sex;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Trainer extends BaseTimeEntity {

  @Column(nullable = false)
  private String nickname;

  @Column(nullable = false)
  private String birth;

  @Column(nullable = false)
  private Sex sex;

  @Column(nullable = false)
  private String phone;

  @Column(nullable = false)
  private String address;
}
