package com.believe.single;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
public class SingleAppApplication {
  public static void main(String[] args) {
    SpringApplication.run(SingleAppApplication.class, args);
  }
}

@RestController
class IndexController {

  @Autowired
  private Environment environment;

  @GetMapping(value = "/")
  public String index() {
    return String.format("SingleApp(active: %s ) is live.",
      Arrays.stream(environment.getActiveProfiles()).map(value -> value + ",").collect(Collectors.toList()).toString());
  }
}
