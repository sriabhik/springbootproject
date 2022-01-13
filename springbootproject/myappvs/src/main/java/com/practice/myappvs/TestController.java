package com.practice.myappvs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
 
	@RequestMapping("/")
	@ResponseBody
	public String test() {
		int a = 311;
		int b = 51;
		return "this is just testing  sum of a and b is : " +(a + b) ;
	}
}
