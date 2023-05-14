package com.example.springboothw11.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping(path="/get/name")
    public String getName(){
        return "My name is Wid ";
    }

    @GetMapping(path="/get/age")
    public String getAge(){
        return "My age is 22";
    }

    @GetMapping(path="/get/check/status")
    public String getStatus(){
        return "Everything OK";
    }

    @GetMapping(path="/get/health")
    public String getHealth(){
        return "Server health is up and running";
    }

}
