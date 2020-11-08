package com.bafoly.responsemodel.article;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.bafoly.responsemodel.user.User;

import lombok.Data;

@Data
@Entity
public class Article {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  String title;

  String content;

  @ManyToOne
  User owner;
  
}
