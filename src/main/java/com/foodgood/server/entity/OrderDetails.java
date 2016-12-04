package com.foodgood.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetails {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long orderDetailsId;

    @Column(name = "menu_id", nullable = false, length = 50)
    private long menuId;

    @Column(name = "sum", nullable = false, length = 50)
    private long sum;

    @Column(name = "quantity", nullable = true, length = 50)
    private String quantity;


    public long getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(long orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }


    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
