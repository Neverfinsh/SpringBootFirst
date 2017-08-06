package com.example.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017\8\5 0005.
 *  controller: controller的
 *
 */

@RestController
@RequestMapping("/controller")
public class HelloController {
        @Autowired
        private Girl girl;

        @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
        public String HelloGirl1(@PathVariable("id") Integer  id) {
            return "hello"+id;
        }

//
    @RequestMapping(value = "/test1 ",method = RequestMethod.GET)
    public  String  getParam(@RequestParam("id") Integer myid){
        return "id:"+myid;
    }


    //        requestparam 设置一个默认的值为0
    @RequestMapping(value = "/test2 ",method = RequestMethod.GET)
    public  String  getParam2(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myid){
        return "id:"+myid;
    }
    }
