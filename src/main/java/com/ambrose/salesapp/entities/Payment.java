package com.ambrose.salesapp.entities;
import com.ambrose.salesapp.entities.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "tbl_payment")
public class Payment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long paymentId;
  private float amount;
  private Date paymentDate;
  private PaymentStatus paymentStatus;
  private boolean isDelete;

  @ManyToOne
  @JoinColumn(name = "orderId")
  private Order order;

}
