package com.bafoly.responsemodel.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;

@Data
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonView(View.Admin.class)
  private long id;


  @JsonView(View.Base.class)
  private String username;
  
  @JsonView(View.Base.class)
  private String email;

  private String password;
  
}
