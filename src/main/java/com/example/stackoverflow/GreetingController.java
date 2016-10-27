package com.example.stackoverflow;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	@Value("${my.setting}")
	private String dooDadDefault;

	@RequestMapping(value = "/greeting", method = RequestMethod.POST)
	public void greeting(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "dooDad", required = false) String dooDad){
		dooDad = dooDad == null ? dooDadDefault : dooDad; 
		Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name), dooDad);
		System.out.println(greeting);
	}
}
