package com.springbatch.practice.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleJobConfiguration {
  private final JobBuilderFactory jobBuilderFactory;
  private final StepBuilderFactory stepBuilderFactory;

  public SimpleJobConfiguration(JobBuilderFactory jobBuilderFactory,
      StepBuilderFactory stepBuilderFactory) {
    this.jobBuilderFactory = jobBuilderFactory;
    this.stepBuilderFactory = stepBuilderFactory;
  }

  @Bean
  // Job은 하나의 배치 작업 단위
  // Job 안에는 아래처럼 여러 Step이 존재하고, Step 안에 Tasklet 혹은 Reader & Processor & Writer 묶음이 존재
  public Job simpleJob() {
    return jobBuilderFactory.get("simple job")
        .start(simpleStep2(null))
        .build();
  }

  @Bean
  // A Step is a domain object that encapsulates an independent,
  // sequential phase of a batch job and contains all of the information necessary to define
  // and control the actual batch processing.
  public Step simpleStep1() {
    return stepBuilderFactory.get("simpleStep1")
        //Suppose the job to be run a single granular task then Tasklet processing is used.
        .tasklet((contribution, chunkContext) -> {
          System.out.println(">>>> This is Step1");
          return RepeatStatus.FINISHED;
        }).build();
  }

  @Bean
  @JobScope
  public Step simpleStep2(@Value("#{jobParameters[requestDate]}") String requestDate) {
    return stepBuilderFactory.get("simpleStep2")
        .tasklet((contribution, chunkContext) -> {
          System.out.println(">>>> This is Step2");
          System.out.println(">>>> requestDate:" + requestDate);
          return RepeatStatus.FINISHED;
        }).build();
  }
}
