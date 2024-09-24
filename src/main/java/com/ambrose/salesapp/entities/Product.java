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
@Table(name = "tbl_product")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long productId;
  private String productName;
  private String briefDescription;
  private String fullDescription;
  private String TechnicalSpecifications;
  private float price;
  private String imageUrl;
  private boolean isDelete;

  @ManyToOne
  @JoinColumn(name = "categoryId")
  private Category category;
  @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
  private List<CartItem> cartItems;
}
