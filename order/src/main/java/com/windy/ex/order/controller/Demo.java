package com.windy.ex.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: windy
 * @create: 2020-03-31 17:06
 */
@Controller
public class Demo {

    @ResponseBody
    @RequestMapping("demo")
    public String getDemo(){
        return "this is demo";
    }

}
