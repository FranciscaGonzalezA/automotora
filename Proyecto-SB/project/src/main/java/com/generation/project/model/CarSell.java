package com.generation.project.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name="CarSell")
public class CarSell {
    @Id
    @GeneratedValue
    private Integer id;
    private int cuantity;

    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name="car_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Car car;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="buySell_id")
    private BuySell buySell;

    

    public CarSell() {
    }

    public CarSell(Integer id, int cuantity, Car car, BuySell buySell) {
        this.id = id;
        this.cuantity = cuantity;
        this.car = car;
        this.buySell = buySell;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCuantity() {
        return cuantity;
    }

    public void setCuantity(int cuantity) {
        this.cuantity = cuantity;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public BuySell getBuySell() {
        return buySell;
    }

    public void setBuySell(BuySell buySell) {
        this.buySell = buySell;
    }
}