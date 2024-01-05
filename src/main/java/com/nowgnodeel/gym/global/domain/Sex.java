package com.nowgnodeel.gym.global.domain;

import lombok.Getter;

@Getter
public enum Sex {
  MALE("남자"), FEMALE("여자");

  private final String displayName;
  Sex(String displayName) {
    this.displayName = displayName;
  }
}
