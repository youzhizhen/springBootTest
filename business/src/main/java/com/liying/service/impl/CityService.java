package com.liying.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liying.domain.City;
import com.liying.domain.CityRepository;

@Service
public class CityService {

	@Resource
	private CityRepository cityRepository;
	
	public List<City> findAll() {
		return cityRepository.findAll();
	}
	
	public City save(City city) {
		return cityRepository.save(city);
	}
}
