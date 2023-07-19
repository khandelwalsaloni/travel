package com.travel.controller;

import com.travel.entity.City;
import com.travel.service.CityService;
import com.travel.util.GeneralConstants;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(GeneralConstants.API_URL + GeneralConstants.CITY_URL)
public class CityController {

    @Autowired
    CityService cityService;

    @PostMapping
    public ResponseEntity<City> addCity(@RequestBody City city){
        return new ResponseEntity<>(cityService.addCity(city), HttpStatus.CREATED);
    }

    @GetMapping(GeneralConstants.ID_URL)
    public ResponseEntity<City> getCityById(@PathVariable long id) throws NotFoundException {
        return new ResponseEntity<>(cityService.getCityById(id), HttpStatus.OK);
    }
}
