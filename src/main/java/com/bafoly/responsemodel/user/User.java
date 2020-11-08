package com.bafoly.responsemodel.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.bafoly.responsemodel.article.Article;

import lombok.Data;

@Data
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String username;

  private String lastname;
  
  private String email;

  private String password;

  @OneToMany(mappedBy = "owner")
  private List<Article> articles = new ArrayList<>();
  
}
