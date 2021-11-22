package com.example.demo.controller;
 
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.api.dto.FoodTruckInfo;
import com.example.demo.api.service.ApiService;
 
@Controller
public class HomeController {
	
	@Autowired
	private ApiService apiService;
	
    @RequestMapping(value="/")
    public String getData(Model model) throws IOException {
		List<FoodTruckInfo> list = apiService.search();
		
		model.addAttribute("coordinate",list);
		
        return "index";
    }
    
}