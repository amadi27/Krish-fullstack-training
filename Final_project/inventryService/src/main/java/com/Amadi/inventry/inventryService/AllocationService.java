package com.Amadi.inventry.inventryService;

import org.springframework.stereotype.Service;

@Service
public class AllocationService {
    AllocationRepository allocationRepository;

  /*  public int getCapacity(AllocationModel model) {
        AllocationModel exisitingOrder = allocationRepository.findById(model.getId()).orElse(null);
        String name = exisitingOrder.getStation_name();
        int capacity = exisitingOrder.getFuel_capacity();
        String type = exisitingOrder.getFuel_type();
        return capacity;
    }*/
    public int getCapacity(int id) {
        AllocationModel exisitingOrder = allocationRepository.findById(id).orElse(null);
        String name = exisitingOrder.getStation_name();
        int capacity = exisitingOrder.getFuel_capacity();
        String type = exisitingOrder.getFuel_type();
        return capacity;
    }
}