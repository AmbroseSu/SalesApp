package com.ambrose.salesapp.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "tbl_store_location")
public class StoreLocation {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long storeLocationId;
  private String latitude;
  private String longtitude;
  private String address;
  private boolean isDelete;
}
