package com.foodgood.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "menu_restaurant")
public class Menu {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long menuId;

    @Column(name = "restourant_id", nullable = false, length = 50)
    private long restaurantId;

    @Column(name = "name_dish", nullable = false, length = 50)
    private String nameDish;

    @Column(name = "composition", nullable = false, length = 50)
    private String composition;

    @Column(name = "weight", nullable = false, length = 50)
    private long weight;

    @Column(name = "image_dish", nullable = false, length = 50)
    private String imageDish;


    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getNameDish() {
        return nameDish;
    }

    public void setNameDish(String nameDish) {
        this.nameDish = nameDish;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public String getImageDish() {
        return imageDish;
    }

    public void setImageDish(String imageDish) {
        this.imageDish = imageDish;
    }


}
