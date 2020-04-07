package com.restdocs.practice.api.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import com.restdocs.practice.api.utils.EnumType;

@Getter
@RequiredArgsConstructor
public enum ApiResponseCode implements EnumType {

  OK("요청이 성공하였습니다."),
  BAD_PARAMETER("요청 파라미터가 잘못되었습니다."),
  NOT_FOUND("리소스를 찾지 못했습니다."),
  UNAUTHORIZED("인증에 실패하였습니다."),
  SERVER_ERROR("서버 에러입니다.");

  //왜 메시지를 나중에 작성해야 하는 지 의문이고 좀 더 탐구하도록 하자..
  private final String message;

  public String getId() {
    return name();
  }

  @Override
  public String getText() {
    return message;
  }
}
