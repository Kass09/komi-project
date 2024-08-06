package com.app.scraping.komi.shared.exceptions.model;

import lombok.Getter;

@Getter
public enum ExceptionCode implements ErrorCode {
  TENANT_NOT_FOUND("ERR-001");

  private final String code;
  ExceptionCode(String code) {
    this.code = this.getCode(code);
  }

  @Override
  public String getCode(String code) {
    return code;
  }
}
