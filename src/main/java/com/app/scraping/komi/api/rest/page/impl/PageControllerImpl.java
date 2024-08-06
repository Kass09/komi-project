package com.app.scraping.komi.api.rest.page.impl;

import com.app.scraping.komi.api.rest.page.PageController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page/v1")
@RequiredArgsConstructor
public class PageControllerImpl implements PageController {

  @Override
  public ResponseEntity<Void> create(Object createPageRequest) {
    return null;
  }

  @Override
  public ResponseEntity<Void> findAll() {
    return null;
  }

  @Override
  public ResponseEntity<Void> findAll(Integer pageId) {
    return null;
  }
}
