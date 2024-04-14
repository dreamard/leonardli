package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class lilyController {

    @RequestMapping("/lily")
    public String getup()
    {
        return "lily.html";
    }
}
