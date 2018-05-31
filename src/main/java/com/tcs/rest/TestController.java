package com.tcs.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Value("${user.role}")
	private String role;

	@Value("${user.password}")
	private String password;

	@RequestMapping(value = "/testping", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String whoami() {
		return String.format("Hello - You are a(n) %s and your password is '%s'.\n", role, password);
	}
}
