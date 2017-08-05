package com.example.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017\8\5 0005.
 */

@RestController
public class HelloGirlController {

    @Autowired
    private  Girl girl;

    @RequestMapping(value = "/girl",method = RequestMethod.GET)
    public String HelloGirl(){
    return girl.getCupSize()+girl.getAge();
}

}
