package com.bafoly.responsemodel.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/api/1.0/users")
  @JsonView(View.Admin.class)
  List<User> getUsers(){
    return userService.getUsers();
  }
  
}
