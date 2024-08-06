package com.app.scraping.komi.shared.exceptions.base;

import com.app.scraping.komi.shared.exceptions.model.response.ErrorExceptionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class BaseExceptionHandler {

  private final MessageSource messageSource;

  @ExceptionHandler(BaseException.class)
  public ResponseEntity<ErrorExceptionResponse> errorHandler(BaseException ex) {
    return new ResponseEntity<>(
        ErrorExceptionResponse.builder()
            .status(ex.getStatus().value())
            .code(ex.getCode())
            .message(
                messageSource.getMessage(
                    ex.getExceptionCode().messageCode(),
                    new Object[] {ex.getOutputParam()},
                    LocaleContextHolder.getLocale()))
            .date(ex.getDate().toString())
            .build(),
        HttpStatus.valueOf(ex.getStatus().value()));
  }
}
