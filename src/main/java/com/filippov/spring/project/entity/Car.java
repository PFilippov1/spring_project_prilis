package com.filippov.spring.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "model")
    private String model;
    @Column(name = "color")
    private String color;
//    @Size(min = 2, message = "name must be min 3 symbols")
    @Column(name = "name_owner")
    private String name_owner;
    @Column(name = "phone_owner")
    private String phone_owner;
    @Column(name = "email")
    private String email;

    public Car() {
    }

    public Car(int id, String model, String color, String name_owner, String phone_owner, String email) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.name_owner = name_owner;
        this.phone_owner = phone_owner;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getName_owner() {
        return name_owner;
    }

    public void setName_owner(String name_owner) {
        this.name_owner = name_owner;
    }

    public String getPhone_owner() {
        return phone_owner;
    }

    public void setPhone_owner(String phone_owner) {
        this.phone_owner = phone_owner;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}