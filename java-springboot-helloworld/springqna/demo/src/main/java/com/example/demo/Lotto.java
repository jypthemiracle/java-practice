package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lotto {
  Random ran = new Random();
  ArrayList<Integer> lotto = new ArrayList<>();

  private final static int MIN_LOTTO_NUMBER = 1;
  private final static int MAX_LOTTO_NUMBER = 45;

  public void run() {
    getAutoLottoNumber();
  }

  private ArrayList<Integer> getAutoLottoNumber() {
    int numofLotto = 8;
    for (int i = 0; i < numofLotto; i++) {
      lotto.add(ran.nextInt(MAX_LOTTO_NUMBER - MIN_LOTTO_NUMBER) + 1);
    }
    return lotto;
  }

  public StringBuilder getLotto(){
    StringBuilder output = new StringBuilder();
    for (Integer integer : lotto) {
      output.append(integer).append(" ");
    }
    return output;
  }
}
