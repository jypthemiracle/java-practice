package net.honux.springbootdemo;

import org.springframework.data.annotation.Id;

public class Github {
  @Id
  Long id;
  String githubId;

  public Github(String githubId) {
    this.githubId = githubId;
  }

  @Override
  public String toString() {
    return "Github{" +
        "id=" + id +
        ", githubId='" + githubId + '\'' +
        '}';
  }
}
