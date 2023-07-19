package com.travel.service;

import com.travel.entity.Country;
import com.travel.repository.CountryRepository;
import com.travel.util.GeneralConstants;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country getCountryById(long id) throws NotFoundException {
        return countryRepository.findByIdAndIsDeleted(id, false)
                .orElseThrow(() -> new NotFoundException(GeneralConstants.DUPLICATE_DATA_EXCEPTION));
    }

    public Country getCountryByName(String name) {
        return countryRepository.findByNameAndIsDeleted(name, false);
    }

    public Country editCountry(Country country, long id) throws NotFoundException {
        getCountryById(id);
        return countryRepository.save(country);
    }
}
