package com.example.demo.trySpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 // ポイント１：@Controller
@Controller
public class HelloController {
@GetMapping("/hello")
  public String getHello() {
 return "hello";
 }
}

