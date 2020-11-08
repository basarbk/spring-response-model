package com.bafoly.responsemodel.user;

import org.springframework.beans.factory.annotation.Value;

public interface UserProjection {

  @Value("#{target.username + ' ' + target.lastname}")
  String getFullName();
  
  String getEmail();
  
}
