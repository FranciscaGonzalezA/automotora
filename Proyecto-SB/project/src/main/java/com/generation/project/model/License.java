package com.generation.project.model;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name="License")
public class License {
    @Id
    @GeneratedValue
    private Integer id;
    private int number;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expirationDate;
    private String driverClass;
    private String status;


    @OneToOne(fetch = FetchType.EAGER) 
    @JoinColumn(name="user_id") 
    private User user; 

    
    public License() {
    }

    public License(Integer id, int number, Date expirationDate, String driverClass, String status, User user) {
        this.id = id;
        this.number = number;
        this.expirationDate = expirationDate;
        this.driverClass = driverClass;
        this.status = status;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
