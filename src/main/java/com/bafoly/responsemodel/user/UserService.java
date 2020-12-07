package com.bafoly.responsemodel.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public Page<User> getUsers(Pageable pageable) {
    return userRepository.findAll(pageable);
  }
  
}
