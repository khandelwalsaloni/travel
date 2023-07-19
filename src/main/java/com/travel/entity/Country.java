package com.travel.entity;

import com.travel.util.GeneralConstants;

import javax.persistence.*;

//import jakarta.persistence.*;

@Entity
public class Country extends BaseModel {

    @Column(nullable = false, unique = true, length = 100)
    public String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    public GeneralConstants.CONTINENT continent;

    public Country() {
    }

    public Country(String name, GeneralConstants.CONTINENT continent) {
        this.name = name;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GeneralConstants.CONTINENT getContinent() {
        return continent;
    }

    public void setContinent(GeneralConstants.CONTINENT continent) {
        this.continent = continent;
    }
}
