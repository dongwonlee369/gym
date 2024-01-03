package com.nowgnodeel.gym.cart.domain;

import com.nowgnodeel.gym.global.domain.BaseTimeEntity;
import com.nowgnodeel.gym.product.domain.Product;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductCart extends BaseTimeEntity {

  @Column(nullable = false)
  private String count;

  @Column(nullable = false)
  private String price;

  @ToString.Exclude
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
  private Product product;

  @ToString.Exclude
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
  private Cart cart;
}
