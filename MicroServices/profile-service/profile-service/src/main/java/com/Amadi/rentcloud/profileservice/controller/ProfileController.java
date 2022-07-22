package com.Amadi.rentcloud.profileservice.controller;

import com.Amadi.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/services")
public class ProfileController {
    public Customer save(@RequestBody Customer customer){

        @Autowired
        CustomerService customerService;

        public Customer save(@RequestBody Customer customer){
            return CustomerService.save(customer);

        }



    }
}
