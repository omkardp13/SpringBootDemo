package com.Learning.HelloWorld.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
	@Value("${app.smtp.name}")
	private String smtpName;
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello Modern Students:"+smtpName;
	}
 }
