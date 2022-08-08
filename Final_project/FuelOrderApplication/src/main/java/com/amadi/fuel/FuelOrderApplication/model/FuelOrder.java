package com.amadi.fuel.FuelOrderApplication.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="fuel_order")
public class FuelOrder {

    //private int station_id;


    @Id
    @Column(name = "id", nullable = false)
    private int id;
    private String station_name;

    private int fuel_capacity;
    private String fuel_type;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





    /*public int getStation_id() {
        return station_id;
    }



    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }*/

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public int getFuel_capacity() {
        return fuel_capacity;
    }

    public void setFuel_capacity(int fuel_capacity) {
        this.fuel_capacity = fuel_capacity;
    }
    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }


}
