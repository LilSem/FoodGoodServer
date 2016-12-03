package com.foodgood.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long restaurantId;

    @Column(name = "name_restaurant", nullable = false, length = 50)
    private String nameRestaurant;

    @Column(name = "information", nullable = true, length = 50)
    private String information;

    @Column(name = "credit", nullable = false, length = 50)
    private long credit;

    @Column(name = "location", nullable = false, length = 50)
    private String location;

    @Column(name = "kitchen_id", nullable = false, length = 50)
    private long kithenId;


    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public void setNameRestaurant(String nameRestaurant) {
        this.nameRestaurant = nameRestaurant;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public long getCredit() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getKithenId() {
        return kithenId;
    }

    public void setKithenId(long kithenId) {
        this.kithenId = kithenId;
    }
}
