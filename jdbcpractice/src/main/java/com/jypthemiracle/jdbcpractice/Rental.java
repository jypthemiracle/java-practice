package com.jypthemiracle.jdbcpractice;

import java.time.Duration;
import org.springframework.data.annotation.Id;

public class Rental {
  @Id
  private Long id;
  private Duration duration;
  private Integer price;

  Rental(Duration duration, Integer price) {
    this.duration = duration;
    this.price = price;
  }

  public Long getId() {
    return id;
  }

  public Duration getDuration() {
    return duration;
  }

  public Integer getPrice() {
    return price;
  }
}