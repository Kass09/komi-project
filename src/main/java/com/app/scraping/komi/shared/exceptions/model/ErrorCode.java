package com.app.scraping.komi.shared.exceptions.model;

public interface ErrorCode {
  String EXCEPTION = "Exception";

  String name();

  String getCode(String code);

  default String messageCode() {
    return String.format("%s.%s", EXCEPTION, this.name());
  }
}
