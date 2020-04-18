package com.selfpaced.dockerpoc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public ResponseEntity<?> serverStatus() {
		return ResponseEntity.status(HttpStatus.OK).body("Working");
	}

	@GetMapping("/status")
	public ResponseEntity<?> getApiStatus() {
		return ResponseEntity.status(HttpStatus.OK).body("API also Working");
	}

}
