package com.app.scraping.komi.shared.exceptions.impl.tenant;

import com.app.scraping.komi.shared.exceptions.base.BaseException;
import com.app.scraping.komi.shared.exceptions.model.ExceptionCode;
import org.springframework.http.HttpStatus;

public class TenantNotFoundException extends BaseException {

  public TenantNotFoundException(ExceptionCode exceptionCode, String param) {
    super(HttpStatus.NOT_FOUND, param, exceptionCode);
  }
}
