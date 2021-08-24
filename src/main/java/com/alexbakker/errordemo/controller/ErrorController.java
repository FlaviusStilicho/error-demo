package com.alexbakker.errordemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ErrorController {

    @GetMapping("/")
    public void getOk() {}

    @GetMapping("/error")
    public void getError() {
        throw new NullPointerException();
    }
}
