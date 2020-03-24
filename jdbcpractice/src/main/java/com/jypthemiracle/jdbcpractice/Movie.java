package com.jypthemiracle.jdbcpractice;

import java.util.List;
import java.util.Set;
import org.springframework.data.annotation.Id;

public class Movie {
  @Id
  private Long id;
  private String title;
  private String description;
  private List<Rental> rental;

  Movie(Long id, String title, String description, List<Rental> rental) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.rental = rental;
  }

  void addRental(Rental rental) {
    this.rental.add(rental);
  }

  @Override
  public String toString() {
    return "Movie{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", description='" + description + '\'' +
        '}';
  }

  public List<Rental> getRental() {
    return rental;
  }
}
