package com.springbatch.practice;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;

@EnableBatchProcessing //배치기능 활성화
@SpringBootApplication
public class PracticeApplication {

  public static void main(String[] args) {
    SpringApplication.run(PracticeApplication.class, args);
  }

}