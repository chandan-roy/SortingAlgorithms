package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.HealthResponseDTO;

@Service
public interface HibernateService {
	public HealthResponseDTO healthCheck();

}
