package com.cvvface.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	@RequestMapping("/hellocvv")
	public String sayHi(){
		System.out.println("hello word");
		return"aa";
		
	}

}
