package com.example.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017\8\5 0005.
 */

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/first",method = RequestMethod.GET)
    public String  HelloWorld(){
        return  "hello springboot";
    }
}
