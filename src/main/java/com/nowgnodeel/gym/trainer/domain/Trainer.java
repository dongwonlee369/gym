package com.nowgnodeel.gym.trainer.domain;

import com.nowgnodeel.gym.global.domain.BaseTimeEntity;
import com.nowgnodeel.gym.global.domain.Sex;
import com.nowgnodeel.gym.license.domain.License;
import com.nowgnodeel.gym.pt.domain.Pt;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

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

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private Sex sex;

  @Column(nullable = false)
  private String phone;

  @Column(nullable = false)
  private String address;

  @ToString.Exclude
  @OneToMany(mappedBy = "trainer", fetch = FetchType.LAZY)
  private List<Pt> pts = new ArrayList<>();

  @ToString.Exclude
  @OneToMany(mappedBy = "trainer", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, orphanRemoval = true)
  private List<License> licenses = new ArrayList<>();
}
