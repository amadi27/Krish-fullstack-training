package com.Amadi.rentCar.demo_Application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    //this java method will call from service.That means it is a HTTP
    @RequestMapping(value ="/hello" )
    //@RequstMapping -it map the request into java method.when having url "/hello",it map to this method.
    public String Greeting(){
        return "Hello springBoot";
    }
}
