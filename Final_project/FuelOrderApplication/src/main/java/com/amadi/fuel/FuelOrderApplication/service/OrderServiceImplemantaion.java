package com.amadi.fuel.FuelOrderApplication.service;

import com.amadi.fuel.FuelOrderApplication.OrderRepository;
import com.amadi.fuel.FuelOrderApplication.model.FuelOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImplemantaion implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    public FuelOrder save(FuelOrder fualorder){
        return orderRepository.save(fualorder);

    }

    @Override
    public List<FuelOrder> ViewOrderDetails() {
        return orderRepository.findAll();
    }

    public FuelOrder ViewOrderDetails(int id){
        Optional<FuelOrder> order= orderRepository.findAllById(id);
        if(order.isPresent()){
            return order.get();
        }
        return null;

    }


}
