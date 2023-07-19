package com.travel.repository;

import com.travel.entity.Country;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends BaseRepository<Country, Long> {

    Country findByNameAndIsDeleted(String name, boolean isDeleted);
}
