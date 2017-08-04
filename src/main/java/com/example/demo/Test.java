package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017\8\2 0002.
 */
@RestController
public class Test {

    @Value( "${server.cupSize}" )
    private  String cupSize;
    @Value("${server.age}")
    private  int age;

    @Value("${server.content}")
    private  String content;


    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String   test1(){
        return content;
    }

    @RequestMapping(value = "/hello2" , method = RequestMethod.GET)
    public int    test2(){
        return age;
    }

}
