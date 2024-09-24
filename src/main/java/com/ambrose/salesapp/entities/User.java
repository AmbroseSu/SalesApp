package com.ambrose.salesapp.entities;


import com.ambrose.salesapp.entities.enums.Gender;
import com.ambrose.salesapp.entities.enums.Role;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Collection;
import java.util.List;
import lombok.Data;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@ToString
@Entity
@Table(name = "tbl_user")
public class User implements UserDetails {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;
  private String fullname;
  private String email;
  private String password;
  private String phoneNumber;
  private String address;
  private Role role;
  private Gender gender;
  private String image;
  private String fcmToken;
  private boolean isDelete;
  private boolean isEnabled = false;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<Notification> notifications;
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<Cart> carts;
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<Order> orders;
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<ChatMessage> chatMessages;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return List.of(new SimpleGrantedAuthority(role.name()));
  }

  @Override
  public String getUsername() {
    return email;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return isEnabled;
  }
}
