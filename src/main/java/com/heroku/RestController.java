package com.heroku;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = {"*"})
public class RestController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Heroku app";
    }

    @GetMapping("/user/{user}")
    public String welcomeUser(@PathVariable String  user){
        return "Welcome "+user+" user to Heroku app";
    }

}
