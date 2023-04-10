package com.happn.interview;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Crossing {
  private User userA;
  private User userB;
  private Position position;
}
