package com.travel.util;

public interface GeneralConstants {

    enum CONTINENT {africa, antarctic, asia, australia, europe, north_america,
        south_america};
    enum METHOD_TYPE {delete, get, post, put};

    // URL Constants
    String API_URL = "/api";
    String COUNTRY_URL = "/country";
    String CITY_ATTRACTION_URL = "/city-attraction";
    String CITY_URL = "/city";
    String ID_URL = "/{id}";

    // Errors and Exceptions Constants
    String GET_COUNTRIES_API_NOT_WORKING = "Get list of countries api is not working !!";
    String DUPLICATE_DATA_EXCEPTION = "Already exists !!";
}
