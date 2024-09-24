package com.ambrose.salesapp.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "tbl_cart")
public class Cart {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long cartId;
  private float totalPrice;
  private boolean status;
  private boolean isDelete;

  @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
  private List<CartItem> cartItems;
  @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
  private List<Order> orders;
  @ManyToOne
  @JoinColumn(name = "userId")
  private User user;

}
