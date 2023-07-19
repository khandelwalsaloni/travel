package com.travel.service;

import com.travel.entity.CityAttraction;
import com.travel.repository.CityAttractionRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityAttractionService {

    @Autowired
    CityAttractionRepository cityAttractionRepository;

    public CityAttraction addCityAttraction (CityAttraction cityAttraction) {
        return cityAttractionRepository.save(cityAttraction);
    }

    public CityAttraction getCityAttractionById(long id) throws NotFoundException {
        return cityAttractionRepository.findByIdAndIsDeleted(id, false)
                  .orElseThrow(()-> new NotFoundException(""));
    }
}
