package com.example.hellodocker.controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("hello-there")
    String helloBack(@RequestParam(value = "user", required = false) Optional<String> id) {
        return "Hello " + id.orElseGet(()->"Stranger");
    }
}
