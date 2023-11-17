package com.example.demo.trySpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 // ポイント１：@Controller
@Controller
public class HelloController {
 // ポイント１：@Controller
@GetMapping("/hello")
  public String getHello() {
 //hello.htmlに画面遷移
 return "hello";
 }
}

