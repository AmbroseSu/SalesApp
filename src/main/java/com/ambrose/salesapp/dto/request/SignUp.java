package com.ambrose.salesapp.dto.request;



import com.ambrose.salesapp.entities.enums.Gender;
import lombok.Data;

@Data
public class SignUp {
  String email;
  String fullname;
  String phone;
  String password;
  String address;
  Gender gender;
  String fcmtoken;
}
