package com.liying.webapi.controller;


import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liying.domain.City;
import com.liying.service.impl.CityService;

@RestController
public class TestController {
	
	@Resource
	private CityService cityService;

    @RequestMapping("/")
    public Object home() {
        return cityService.findAll();
    }
    
    @RequestMapping("save")
    public Object save() {
        City city = new City("liying", "12");
		return cityService.save(city );
    }
}
