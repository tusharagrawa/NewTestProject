package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("DiscoveryService")
public interface OtherService {
	
	@GetMapping("/")
	public String getDisplay();
	
}
