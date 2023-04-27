package com.iouahran.movies.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieApiImpl implements MovieApi{

	@Override
	public String testStatus() {
		
		return "Movies backend works !";
	}

}
