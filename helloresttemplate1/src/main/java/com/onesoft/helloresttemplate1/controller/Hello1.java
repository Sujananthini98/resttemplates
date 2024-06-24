package com.onesoft.helloresttemplate1.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Hello1 {
	
	@Autowired
	RestTemplate rest;
	@GetMapping("getData")
	public String get() {
	String url="http://localhost:8081/Hi";
	ResponseEntity<String> a=rest.exchange(url,HttpMethod.GET, null, String.class);
	String d=a.getBody();       
	return d;
	}
}