package com.generation.project.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name="BuySell")
public class BuySell {
    @Id
    @GeneratedValue
    private Integer id;
    @Range(min=0)
    private int amount;
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date buyDate;


    //@JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name="user_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;


    //many to many de car
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "CarSell",
        joinColumns = @JoinColumn(name="buySell_id"),
        inverseJoinColumns = @JoinColumn(name="car_id")
    )
    private List<Car> car;


    public BuySell() {
    }


    public BuySell(Integer id, @Range(min = 0) int amount, Date buyDate, User user, List<Car> car) {
        this.id = id;
        this.amount = amount;
        this.buyDate = buyDate;
        this.user = user;
        this.car = car;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }
}
