package com.iouahran.movies.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.Test;


@WebMvcTest(MovieApiImpl.class)
public class MovieApiTest {
	public static final String TEST_STATUS_API = "/movies_backend/status";
	@Autowired
	private MockMvc mvc;

	@Test
	public void testStatusServiceIfWorking() throws Exception{
		// insérer une route /movies_backend/status
		MockHttpServletResponse response = mvc.perform(get(TEST_STATUS_API)
						.contentType(MediaType.APPLICATION_JSON))
				.andReturn().getResponse();
		// tester si la réponse code est 200
		org.hamcrest.MatcherAssert.assertThat(response.getStatus(), is(200));
		// HttpStatus.OK : failure

	}

}
