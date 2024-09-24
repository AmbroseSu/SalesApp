package com.ambrose.salesapp.dto;


import com.ambrose.salesapp.entities.enums.Gender;
import com.ambrose.salesapp.entities.enums.Role;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
  private Long userId;
  private String fullname;
  private String address;
  private String email;
  private String phone;
  private String status;
  private Gender gender;
  private Role role;
  private String fcm;
  private boolean isDelete;
  private List<Long> deliveryIds;
  private List<Long> ordersIds;
  private List<Long> returnsIds;
  private List<Long> messagesIds;
  private List<Long> userChatsIds;
  private Long cartId;
}
