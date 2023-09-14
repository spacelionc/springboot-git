package com.zixue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Test01 {
	
	@RequestMapping("/world")
	public String name() {
		return "加油呀呀呀呀呀第二再来大师傅士大夫";
	}

}
