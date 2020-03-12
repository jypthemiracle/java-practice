package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by country on 2017-06-16.
 */
@RestController
public class HomeController {

  @GetMapping("/home")
  public User index() {
    User user = new User();
    user.setId("countryxide");
    user.setPassword("pass");
    user.setName("country");
    return user;
  }

  @GetMapping("/lotto")
  public Lotto lottoNum() {
    Lotto lotto = new Lotto();
    lotto.run();
    lotto.getLotto();
    return lotto;
  }
}