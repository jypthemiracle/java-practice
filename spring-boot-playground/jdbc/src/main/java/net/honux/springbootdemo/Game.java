package net.honux.springbootdemo;

import org.springframework.data.annotation.Id;

public class Game {

  @Id
  private Long id;
  private String title;

  public Game(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Game{" +
        "id=" + id +
        ", title='" + title + '\'' +
        '}';
  }
}
