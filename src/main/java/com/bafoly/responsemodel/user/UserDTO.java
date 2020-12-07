package com.bafoly.responsemodel.user;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bafoly.responsemodel.article.ArticleDTO;

import lombok.Data;

@Data
public class UserDTO {

  private String fullName;

  private String email;

  private List<ArticleDTO> articles = new ArrayList<>();

  public UserDTO(User user){
    this.setFullName(user.getUsername() + " " + user.getLastname());
    this.setEmail(user.getEmail());
    List<ArticleDTO> articleDTOs = user.getArticles().stream().map(ArticleDTO::new).collect(Collectors.toList());
    this.setArticles(articleDTOs);
  }
  
}
