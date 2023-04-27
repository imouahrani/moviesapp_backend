package com.iouahran.movies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("movies_backend")
public interface MovieApi {
	// tester si le service fonctionne
	@GetMapping(path="/status")
	public String testStatus();
}
