package com.cmss.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppService {

	@Autowired
	private	RestTemplate template;
	
	public String consumeApi() {
		return template.getForObject("https://gorest.co.in/public/v2/posts", String.class);
	}
}
