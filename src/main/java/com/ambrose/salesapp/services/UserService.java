package com.ambrose.salesapp.services;



import com.ambrose.salesapp.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService {
  UserDetailsService userDetailsService();

  void saveUserVerificationToken(User theUser, String verificationToken);
  //void saveUserVerificationTokenSMS(User theUser, String token);

  String validateToken(String theToken, Long id);
  //String validateTokenSms(String theToken, Long id);

  //ResponseEntity<?> findUserByRole(Role role, int page, int limit);
  //ResponseEntity<?> findById(Long id);
  //ResponseEntity<?> findAll(int page, int limit);

}
