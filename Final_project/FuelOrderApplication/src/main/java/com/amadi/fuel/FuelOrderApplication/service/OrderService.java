package com.amadi.fuel.FuelOrderApplication.service;

import com.amadi.fuel.FuelOrderApplication.model.FuelOrder;

import java.util.List;

public interface OrderService {
     FuelOrder ViewOrderDetails(int id) ;


    FuelOrder save(FuelOrder fualorder);

    List<FuelOrder> ViewOrderDetails();
}
