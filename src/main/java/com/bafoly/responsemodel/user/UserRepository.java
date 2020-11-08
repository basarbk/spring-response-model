package com.bafoly.responsemodel.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long>{

  @Query(value = "Select * from user", nativeQuery = true)
  List<UserProjection> getAllUsers();
  
}
