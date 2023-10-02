package dev.vpetrov.contentcalendar.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

	@Value("${cc.welcomeMessage: Default welcome message}")
	private String welcomeMessage;
	@GetMapping("/")
	public String getHome() {
		return welcomeMessage;
	}

}
