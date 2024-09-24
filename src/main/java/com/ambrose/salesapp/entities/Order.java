package com.ambrose.salesapp.entities;

import com.ambrose.salesapp.entities.enums.OrderStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "tbl_order")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long orderId;
  private String paymentMethod;
  private String billingAddress;
  private OrderStatus orderStatus;
  private Date orderDate;
  private boolean isDelete;

  @ManyToOne
  @JoinColumn(name = "cartId")
  private Cart cart;
  @ManyToOne
  @JoinColumn(name = "userId")
  private User user;
  @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
  public List<Payment> payments;

}
