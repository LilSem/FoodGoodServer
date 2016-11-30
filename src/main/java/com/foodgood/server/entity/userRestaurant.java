package com.foodgood.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_restaurant")
public class userRestaurant {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long userId;

    @Column(name = "surname", nullable = false, length = 50)
    private String surname;

    @Column(name = "Name", nullable = false, length = 50)
    private String name ;

    @Column(name = "patronymic_name", nullable = false, length = 50)
    private String patronymicName;

    @Column(name = "location", nullable = false, length = 50)
    private String location;

    @Column(name = "telephone_number", nullable = false, length = 50)
    private long telephoneNumber;

    @Column(name = "date_birthday", nullable = false)
    private Date dateBirthday;

    @Column(name = "bonus_points", nullable = false, length = 50)
    private long bonusPoints;



    public long getId() {
        return userId;
    }

    public void setId(long userId) {
        this.userId = userId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Date getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(Date dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public long getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(long bonusPoints) {
        this.bonusPoints = bonusPoints;
    }
}
