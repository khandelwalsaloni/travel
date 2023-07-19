package com.travel.repository;

import com.travel.entity.City;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityRepository extends BaseRepository<City, Long> {

    //Optional<City> findByNameAndIsDeleted(String name, boolean isDeleted);
}
