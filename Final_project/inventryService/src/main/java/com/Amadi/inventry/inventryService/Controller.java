package com.Amadi.inventry.inventryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    AllocationRepository allocationRepository;

    @Autowired
    AllocationService allocationService;

    @RequestMapping(value = "/order", method = RequestMethod.GET)

    List<AllocationModel> getAllOrders() {
        return allocationRepository.findAll();
    }

   /* @RequestMapping(value = "/orderCapacity", method = RequestMethod.GET)
    public int capacity(@RequestBody AllocationModel allocationModel){
        return allocationService.getCapacity(allocationModel);
    }*/

    @RequestMapping(value = "/orderCapacity", method = RequestMethod.GET)
    public int capacity(@RequestParam int id){
        return allocationService.getCapacity(id);
    }




    }

