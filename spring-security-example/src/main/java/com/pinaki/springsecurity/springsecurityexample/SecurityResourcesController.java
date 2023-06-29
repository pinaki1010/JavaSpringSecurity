package com.pinaki.springsecurity.springsecurityexample;


import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
@RestController
public class SecurityResourcesController {
	
	
	@GetMapping("/csrf")
	public CsrfToken retriveCSRF(HttpServletRequest httpServletRequest) {
		
		return (CsrfToken) httpServletRequest.getAttribute("_csrf");
		
	}

}
