package com.example.userservice.controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    @CrossOrigin
    @ResponseBody
    String helloBack() {
        return("Hello Stranger");
    }
}
