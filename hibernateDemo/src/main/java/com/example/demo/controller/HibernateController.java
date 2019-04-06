package com.example.demo.controller;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.HealthResponseDTO;
import com.example.demo.service.HibernateService;

@RestController
public class HibernateController {
	
	@Autowired
	private HibernateService hibernateService;
	
	@RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
	@ResponseBody
	public HealthResponseDTO healthCheck() {
		return hibernateService.healthCheck();
	}

}
