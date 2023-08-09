package com.zulhusnidev.meNu.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Menu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String restaurant;
    private double price;
    private int rate;
    private String imageUrl;
    private String comment;

    public Menu(){

    }

    public Menu(Long id, String name, String restaurant, double price, int rate, String imageUrl, String comment) {
        this.id = id;
        this.name = name;
        this.restaurant = restaurant;
        this.price = price;
        this.rate = rate;
        this.imageUrl = imageUrl;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", restaurant='" + restaurant + '\'' +
                ", price='" + price + '\'' +
                ", rate='" + rate + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
