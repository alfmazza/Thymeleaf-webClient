package com.sa.fe.controller;

import com.sa.fe.model.Properties;
import com.sa.fe.service.PropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;



@Controller
public class PropertiesController {
    
    @Autowired
    PropertiesService propertiesService;


    @GetMapping("/properties")
    public String findAll(Model model) {
        Flux<Properties> fluxProperties = propertiesService.getBFF();
        model.addAttribute("properties", fluxProperties.collectList().block());
        
        return "properties";
    }   
}
