package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanContoller {
  
  @RequestMapping("/")
  public String index(@RequestParam(value="name", required=false, defaultValue = "Human") String searchQuery) {
        return "Hello " + searchQuery;
    
      }

}
