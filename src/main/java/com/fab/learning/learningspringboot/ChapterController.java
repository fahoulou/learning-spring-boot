package com.fab.learning.learningspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(path = "/chapters")
public class ChapterController {

  private final ChapterRepository repo;

  public ChapterController(ChapterRepository repo) {
    this.repo = repo;
  }

  @GetMapping
  public Flux<Chapter> listing() {
    return repo.findAll();
  }

}
