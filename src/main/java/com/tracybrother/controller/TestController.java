package com.tracybrother.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //可以使用restc
@RequestMapping
public class TestController {
	@ResponseBody
	@RequestMapping("/abc")
	public String test1() {
		System.out.println("测试");
		return "测试s1111";
	}
}
