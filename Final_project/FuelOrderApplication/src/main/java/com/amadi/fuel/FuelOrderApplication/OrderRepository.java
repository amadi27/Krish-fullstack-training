package com.amadi.fuel.FuelOrderApplication;

import com.amadi.fuel.FuelOrderApplication.model.FuelOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<FuelOrder,Integer> {
    Optional<FuelOrder> findAllById(int id);


    //FuelOrder Save(FuelOrder fuelOrder);



}
