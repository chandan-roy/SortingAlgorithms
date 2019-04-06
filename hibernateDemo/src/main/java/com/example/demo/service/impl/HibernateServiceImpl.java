package com.example.demo.service.impl;

import org.springframework.stereotype.Component;

import com.example.demo.dto.HealthResponseDTO;
import com.example.demo.service.HibernateService;

@Component
public class HibernateServiceImpl implements HibernateService {

	@Override
	public HealthResponseDTO healthCheck() {
		HealthResponseDTO response = new HealthResponseDTO();
		response.setMessage("The app is running fine");
		return response;
	}

}
