package com.nowgnodeel.gym.global.domain;

import com.nowgnodeel.gym.member.domain.Enroll;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Membership extends BaseTimeEntity {

  @Column(nullable = false)
  private MembershipType membershipType;

  @Column(nullable = false)
  private String months;

  @Column(nullable = false)
  private String price;

  @ToString.Exclude
  @OneToMany(mappedBy = "membership", fetch = FetchType.LAZY)
  private List<Enroll> enrolls = new ArrayList<>();
}
