package com.bafoly.responsemodel.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

	public List<User> getUsers() {
    return userRepository.findAll();
	}
  
}
