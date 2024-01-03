package com.nowgnodeel.gym.product.domain;

import com.nowgnodeel.gym.cart.domain.ProductCart;
import com.nowgnodeel.gym.global.domain.BaseTimeEntity;
import com.nowgnodeel.gym.global.domain.Category;
import com.nowgnodeel.gym.order.domain.ProductOrder;
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
public class Product extends BaseTimeEntity {

  @Column(nullable = false)
  private String productName;

  @Column(nullable = false)
  private String price;

  @Column(nullable = false)
  private Category category;

  @Column(nullable = false)
  private String stock;

  @ToString.Exclude
  @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
  private List<ProductOrder> productOrders = new ArrayList<>();

  @ToString.Exclude
  @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
  private List<ProductCart> productCarts = new ArrayList<>();
}
