package com.bafoly.responsemodel.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long>{

  @Query("Select u from User u")
  List<UserProjection> getAllUsers();
  
}
