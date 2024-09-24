package com.ambrose.salesapp.services;



import com.ambrose.salesapp.dto.request.RefreshTokenRequest;
import com.ambrose.salesapp.dto.request.SignUp;
import com.ambrose.salesapp.dto.request.SigninRequest;
import org.springframework.http.ResponseEntity;

public interface AuthenticationService {
  ResponseEntity<?> signin(SigninRequest signinRequest);

  ResponseEntity<?> signinGoogle(String email);
  ResponseEntity<?> refreshToken(RefreshTokenRequest refreshTokenRequest);

  public ResponseEntity<?> checkEmail(String email);
  public String checkResetVerifyToken(String email, Long id);
  public ResponseEntity<?> saveInfor(SignUp signUp);
  public ResponseEntity<?> checkEmailForgotPassword(String email);
  public ResponseEntity<?> changePassword(String email, String password);
  //public ResponseEntity<?> saveInforGoogle(SignUpGoogle signUpGoogle);
}
