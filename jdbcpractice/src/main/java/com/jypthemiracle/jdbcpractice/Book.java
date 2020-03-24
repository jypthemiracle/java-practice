package com.jypthemiracle.jdbcpractice;

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

  public Book() {
  }

  void addAuthor(Author author) {
    this.authors.add(new AuthorRef(author.getId(), author.getName()));
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Set<AuthorRef> getAuthors() {
    return authors;
  }

  public void setAuthors(Set<AuthorRef> authors) {
    this.authors = authors;
  }

  Set<Long> getAuthorIds() {
    return this.authors.stream()
        .map(AuthorRef::getAuthor)
        .collect(Collectors.toSet());
  }

  Set<String> getAuthorName() {
    return this.authors.stream()
        .map(author -> author.getName())
        .collect(Collectors.toSet());
  }
}
