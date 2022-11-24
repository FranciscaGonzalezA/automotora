package com.generation.project.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity(name="User")  
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @Column(name="last_name") 
    private String lastName;
    private String mail;
    

    //@JsonBackReference
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private License license;


    //@JsonBackReference
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BuySell> buySell;


    public User() {
    }

    public User(int id, String name, String lastName, String mail, License license, List<BuySell> buySell) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.license = license;
        this.buySell = buySell;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public List<BuySell> getBuySell() {
        return buySell;
    }

    public void setBuySell(List<BuySell> buySell) {
        this.buySell = buySell;
    }
}
