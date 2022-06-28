package com.example.demo;

import com.programming.techie.springredditclone.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(com.example.demo.DemoApplication.class, args);
  }
}
