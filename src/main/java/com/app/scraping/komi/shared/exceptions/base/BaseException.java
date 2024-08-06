package com.app.scraping.komi.shared.exceptions.base;

import com.app.scraping.komi.shared.exceptions.model.ExceptionCode;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class BaseException extends RuntimeException {

  private final HttpStatus status;
  private final String code;
  private final String outputParam;
  private final LocalDateTime date;
  private final ExceptionCode exceptionCode;
  private final String id = UUID.randomUUID().toString();

  protected BaseException(HttpStatus status, String outputParam, ExceptionCode exceptionCode) {
    this.code = exceptionCode.getCode();
    this.outputParam = outputParam;
    this.status = status;
    this.exceptionCode = exceptionCode;
    this.date = LocalDateTime.now(ZoneId.systemDefault());
  }
}
