package com.cmss.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmss.Service.AppService;

@RestController
public class DemoController {

	@Autowired 
	private AppService service;
	@GetMapping("/get")
	public String getdata() {
		
		return service.consumeApi();
	}
	
}
