package com.amadi.fuel.FuelOrderApplication.controller;

import com.amadi.fuel.FuelOrderApplication.model.FuelOrder;
import com.amadi.fuel.FuelOrderApplication.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value ="/hello",method = RequestMethod.POST)
    public String greeting(){
        return "Hello  ";
    }


    //create fualOrder end point.then pass fualoder object.then that fualoder object go to service.in service create @service and mange the repository
   /* @RequestMapping(value = "/order", method = RequestMethod.POST)
    public FuelOrder save(@RequestBody FuelOrder fualorder) {
        return orderService.save(fualorder);
    }*/

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public String save(@RequestBody FuelOrder fualorder) {
         orderService.save(fualorder);
    return" Oder is suceesfully added";}

    @RequestMapping(value = "/orderbyId", method = RequestMethod.GET)
    public ResponseEntity<FuelOrder> ViewOrders(@RequestParam int id){
        FuelOrder fuelOrder= orderService.ViewOrderDetails(id);
        if(fuelOrder ==null){
            return ResponseEntity.notFound().build();

        }else{
            return ResponseEntity.ok().body(fuelOrder);
        }
}
        @RequestMapping(value = "/order", method = RequestMethod.GET)
        public List<FuelOrder> getoders(){
        return orderService.ViewOrderDetails();
        }

        }
