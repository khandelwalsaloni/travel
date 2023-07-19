package com.travel.entity;

//import jakarta.persistence.Entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import javax.persistence.*;

@Entity
public class CityAttraction extends BaseModel {

    @Column(nullable = false)
    public String name;

//    @ManyToOne
//    @JoinColumn(nullable = false)
//    public City city;

    //TODO define limit min and max
    public Integer rating;

    public CityAttraction() {
    }

    public CityAttraction(String name, City city, Integer rating) {
        this.name = name;
       // this.city = city;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public City getCity() {
//        return city;
//    }
//
//    public void setCity(City city) {
//        this.city = city;
//    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}