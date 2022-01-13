package com.onlyjavatech.durgesh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {
	@RequestMapping("/test")
	public String firstHandler() {
		
		//in spring mvc here we use index.jsp type,to overcome this we use responsebody above
		return "Testing";
	}
}
