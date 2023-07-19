package com.travel.controller;

import com.travel.entity.Country;
import com.travel.service.CountryService;
import com.travel.util.GeneralConstants;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(GeneralConstants.API_URL + GeneralConstants.COUNTRY_URL)
public class CountryController {

    @Autowired
    CountryService countryService;

    @PostMapping
    public ResponseEntity<Country> addCountry(@RequestBody Country country){
        return new ResponseEntity<>(countryService.addCountry(country), HttpStatus.CREATED);
    }

    @GetMapping(GeneralConstants.ID_URL)
    public ResponseEntity<Country> getCountryById(@PathVariable long id) throws NotFoundException {
        return new ResponseEntity<>(countryService.getCountryById(id), HttpStatus.OK);
    }
}
