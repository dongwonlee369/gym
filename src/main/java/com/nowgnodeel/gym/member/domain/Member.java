package com.nowgnodeel.gym.member.domain;

import com.nowgnodeel.gym.cart.domain.Cart;
import com.nowgnodeel.gym.global.domain.BaseTimeEntity;
import com.nowgnodeel.gym.global.domain.Sex;
import com.nowgnodeel.gym.order.domain.Order;
import com.nowgnodeel.gym.pt.domain.Pt;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@ToString
public class Member extends BaseTimeEntity {

  /*@Column(nullable = false, unique = true)
  private String username;

  @Column(nullable = false)
  private String password;*/

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

  @ToString.Exclude
  @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
  private List<MemberCreditCard> memberCreditCards = new ArrayList<>();

  @ToString.Exclude
  @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
  private List<Enroll> enrolls = new ArrayList<>();

  @ToString.Exclude
  @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
  private List<Pt> pts = new ArrayList<>();

  @ToString.Exclude
  @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
  private List<Order> orders = new ArrayList<>();

  @ToString.Exclude
  @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
  private List<Cart> carts = new ArrayList<>();
}
