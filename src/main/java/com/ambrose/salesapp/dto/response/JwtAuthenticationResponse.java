package com.ambrose.salesapp.dto.response;


import com.ambrose.salesapp.dto.UserDTO;
import lombok.Data;

@Data
public class JwtAuthenticationResponse {
  private UserDTO userDTO;
  private String token;
  private String refreshToken;
}
