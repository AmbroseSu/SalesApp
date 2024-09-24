package com.ambrose.salesapp.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "tbl_cart_item")
public class CartItem {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long cartItemId;
  private int quantity;
  private float price;
  private boolean isDelete;

  @ManyToOne
  @JoinColumn(name = "productId")
  private Product product;
  @ManyToOne
  @JoinColumn(name = "cartId")
  private Cart cart;
}
