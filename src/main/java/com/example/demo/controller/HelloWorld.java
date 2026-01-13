package com.example.demo.controller;


import com.example.demo.service.DemoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/hello")
@RequiredArgsConstructor

public class HelloWorld {

    private final DemoService demoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String helloWorld(@RequestParam String greeterName) {
        return demoService.helloMessage(greeterName);

    }
}
