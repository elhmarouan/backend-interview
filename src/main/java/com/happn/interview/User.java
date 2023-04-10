package com.happn.interview;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
  private String userId;
  private String fullName;
  private Position lastPosition;
}
