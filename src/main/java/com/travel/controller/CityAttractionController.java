package com.travel.controller;

import com.travel.entity.CityAttraction;
import com.travel.service.CityAttractionService;
import com.travel.util.GeneralConstants;
import javax.servlet.http.HttpServletRequest;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(GeneralConstants.API_URL + GeneralConstants.CITY_ATTRACTION_URL)
public class CityAttractionController {

    @Autowired
    CityAttractionService cityAttractionService;

    @PostMapping
    public ResponseEntity<CityAttraction> addCityAttraction (HttpServletRequest req,
                                                             @RequestBody CityAttraction cityAttraction) {
        return new ResponseEntity<>(cityAttractionService.addCityAttraction(cityAttraction), HttpStatus.CREATED);
    }

    @GetMapping(GeneralConstants.ID_URL)
    public ResponseEntity<CityAttraction> getCityAttractionById(@PathVariable long id) throws NotFoundException {
        return new ResponseEntity<>(cityAttractionService.getCityAttractionById(id), HttpStatus.OK);
    }

}
