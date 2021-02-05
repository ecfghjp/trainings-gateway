package com.ecfghjp.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/trainingfallback")
	public String trainingServiceFallback() {
		return "Training service is taking longer than expected";
	}

	@GetMapping("/employeefallback")
	public String employeeServiceFallback() {
		return "Employee service is taking longer than expected.Please trry again later";
	}
	
	@GetMapping("/statusservicefallback")
	public String statusServiceFallback1() {
		return "Status service is taking longer than expected.Please trry again later";
	}

}
