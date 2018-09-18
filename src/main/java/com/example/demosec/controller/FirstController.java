package com.example.demosec.controller;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping("/getStart")
    public String getStart(String p1){
        System.out.println(p1);
        System.out.println("-------------");
        System.out.println("--asdasdasd-----");
        System.out.println("-啊实打实打算sdasd-----");
        System.out.println("-kkkkkkkkkkkkkkkkkkkkkkkkkkkk-");
        System.out.println("-kk]]]]]]]]]]]]]]]]]]]]]]]]]]]]]-");
        System.out.println("-k/////////////////////////////////////-");
        return p1;
    }
}
