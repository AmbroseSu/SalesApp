package com.ambrose.salesapp.repository;


import com.ambrose.salesapp.entities.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, String> {
  VerificationToken findByToken(String token);
  @Query("SELECT v FROM VerificationToken v WHERE v.user.userId =:id")
  VerificationToken findByUserId(Long id);
}
