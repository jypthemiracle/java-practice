package com.datajdbc.manytomany;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.data.annotation.Id;

public class Book {

  @Id
  private Long id;
  private String ISBN;
  private String title;
  private Set<AuthorRef> authors = new HashSet<>();

  void addAuthor(Author author) {
    this.authors.add(new AuthorRef(author.getId(), author.getName()));
  }

  Set<Long> getAuthorIds() {
      return this.authors.stream().map(AuthorRef::getAuthor).collect(Collectors.toSet());
  }
}