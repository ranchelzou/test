package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @Autowired
 private girlProperties gP;

    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String say(){

        return gP.getCupsize();
    }
}
