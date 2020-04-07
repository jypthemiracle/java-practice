package com.restdocs.practice.api.domain;

import com.restdocs.practice.api.utils.EnumType;
import lombok.Getter;

@Getter
public enum Gender implements EnumType {
  MALE("남자"),
  FEMALE("여자");

  private final String text;

  Gender(String text) {
    this.text = text;
  }

  @Override
  public String getId() {
    return this.name();
  }
}