package com.app.scraping.komi.api.rest.page;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface PageController {
  @PostMapping
  ResponseEntity<Void> create(Object createPageRequest);

  @GetMapping
  ResponseEntity<Void> findAll();

  @GetMapping("/{pageId}")
  ResponseEntity<Void> findAll(@PathVariable("pageId") Integer pageId);
}
