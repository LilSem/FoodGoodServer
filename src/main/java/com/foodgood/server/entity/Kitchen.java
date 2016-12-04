package com.foodgood.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "kitchen")
public class Kitchen {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long kitchenId;

    @Column(name = "restaurant_id", nullable = false, length = 50)
    private long restaurantId;

    @Column(name = "order_details_id", nullable = false, length = 50)
    private long orderDetailsId;

    @Column(name = "status_id", nullable = false, length = 50)
    private String statusId;

    public long getKitchenId() {
        return kitchenId;
    }

    public void setKitchenId(long kitchenId) {
        this.kitchenId = kitchenId;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public long getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(long orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
}
