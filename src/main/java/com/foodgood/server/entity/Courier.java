package com.foodgood.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "courier")
public class Courier {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long courierId;

    @Column(name = "courier_name", nullable = false, length = 50)
    private String courierName;

    @Column(name = "location", nullable = false, length = 50)
    private String location;

    @Column(name = "all_orders", nullable = false, length = 50)
    private long allOrders;


    public long getCourierId() {
        return courierId;
    }

    public void setCourierId(long courierId) {
        this.courierId = courierId;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getAllOrders() {
        return allOrders;
    }

    public void setAllOrders(long allOrders) {
        this.allOrders = allOrders;
    }

}
