package com.app.scraping.komi.shared.exceptions.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorExceptionResponse {

  private Integer status;
  private String code;
  private String message;
  private String date;
}