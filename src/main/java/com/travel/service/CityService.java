package com.travel.service;

import com.travel.entity.City;
import com.travel.repository.CityRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public City addCity(City city) {
//        cityRepository.findByNameAndIsDeleted(city.getName(), false)
//                .orElseThrow(()-> new DuplicateKeyException("Duplicate name"));
        return cityRepository.save(city);
    }

    public City getCityById(long id) throws NotFoundException {
        return cityRepository.findByIdAndIsDeleted(id, false)
                .orElseThrow(() -> new NotFoundException("Not found"));
    }
}
