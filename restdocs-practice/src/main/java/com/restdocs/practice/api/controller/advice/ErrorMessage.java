package com.restdocs.practice.api.controller.advice;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class ErrorMessage {
  private String field;
  private String message;

  @Builder
  public ErrorMessage(String field, String message) {
    this.field = field;
    this.message = message;
  }
}