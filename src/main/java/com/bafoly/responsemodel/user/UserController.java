package com.bafoly.responsemodel.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/api/1.0/users")
  Page<UserDTO> getUsers(Pageable pageable){
    return userService.getUsers(pageable).map(UserDTO::new);
  }
  
}
