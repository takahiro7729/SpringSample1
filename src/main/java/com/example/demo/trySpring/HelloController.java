package com.example.demo.trySpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

 // ポイント１：@Controller
@Controller
public class HelloController {
 // ポイント１：@Controller
@GetMapping("/hello")
  public String getHello() {
 //hello.htmlに画面遷移
 return "hello";
}
// ポイント１：@PostMapping
// ポイント２：@RequestParam
@PostMapping("/hello")
public String postRequest(@RequestParam("text1")String str,
		Model model) {
    //画面から受け取った文字列をmodelに登録
	model.addAttribute("sample",str);
	//helloResponse。htmlに画面遷移
	return "helloResponse";
	}
}