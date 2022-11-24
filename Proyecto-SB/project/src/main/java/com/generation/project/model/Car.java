package com.generation.project.model;

import java.util.List;

import javax.persistence.*;


@Entity(name="Car")
public class Car {
    @Id
    @GeneratedValue
    private Integer id;
    private String brand;
    private String model;
    private String color;
    private int year;
    private int value;


    //@JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "CarSell",  
        joinColumns = @JoinColumn(name="car_id"),  
        inverseJoinColumns = @JoinColumn(name="buySell_id")
    )
    private List<CarSell> carSell;


    public Car() {
    }
    
    public Car(Integer id, String brand, String model, String color, int year, int value, List<CarSell> carSell) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.value = value;
        this.carSell = carSell;
    }



    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }

    public List<CarSell> getCarSell() {
        return carSell;
    }

    public void setCarSell(List<CarSell> carSell) {
        this.carSell = carSell;
    }
}
