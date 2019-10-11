package com.github.rogeriofbrito.springoauth2importexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/foo")
	public ResponseEntity<String> getFoo() {
		return new ResponseEntity<String>("This is the unprotected foo resource", HttpStatus.OK);
	}
}
