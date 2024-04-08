package com.tutorial.gcp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GCP")
public class Controller {

    @GetMapping("/Home")
    public String getGCPHome(){
        return "Welcome to the GCP Tutorials";
    }
}
