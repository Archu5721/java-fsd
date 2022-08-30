package com.example.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalApiController {

	@RequestMapping("/weather")
	public String getWeather(@RequestParam("city") String city) {
		String url="http://api.weatherstack.com/current?access_key=b414e5996c9288e9a04c725a5d94c9f7&query="+city;
		RestTemplate rest = new RestTemplate();
		String Weatherdata= rest.getForObject(url, String.class);
		return Weatherdata;
	}
}
