package com.travel.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.travel.entity.Country;
import com.travel.util.GeneralConstants;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@Service
public class SchedulerService {

    @Autowired
    CountryService countryService;

    HashMap<String, String> countriesMap = new HashMap<>();

    /**
     * To get list of all countries
     */
    @Scheduled(fixedRate = 10, timeUnit = TimeUnit.SECONDS)
    public void getListOfAllCountries() throws IOException {
//        if (this.countriesMap.isEmpty()) {
//            String url = "https://restcountries.com/v3.1/all";
//            String response = callExternalApi(url, GeneralConstants.METHOD_TYPE.get);
//            if (response == null || response.isEmpty()) {
//                throw new IOException(GeneralConstants.GET_COUNTRIES_API_NOT_WORKING);
//            }
//
//            JsonNode responseNode = new ObjectMapper().readTree(response);
//            if (responseNode.isArray()) {
//                for (JsonNode element : responseNode) {
//                    String name = element.get("name").get("common").asText();
//                    String continent = element.get("region").asText();
//                    countriesMap.put(name, continent);
//                }
//            }
//        }
//        String countryName = null;
//        for (String name : countriesMap.keySet()) {
//            Country alreadyExistingCountry = countryService.getCountryByName(name);
//            if(alreadyExistingCountry == null) {
//                String continent = countriesMap.get(name).toString().toLowerCase();
//                if(continent.equals("oceania")) {
//                    continent = "australia";
//                }
//                if(continent.equals("americas")) {
//                    continent = "north_america";
//                }
//                Country country = new Country(name, GeneralConstants.CONTINENT.valueOf(continent));
//                countryService.addCountry(country);
//            }
//            countryName = name;
//            break;
//        }
//        if (countryName != null) {
//            countriesMap.remove(countryName);
//        }
    }

    public String callExternalApi(String url, GeneralConstants.METHOD_TYPE methodType) throws IOException {
        HttpClient apacheClient = HttpClients.custom().build();
        switch (methodType) {
            case get:
                HttpGet request = new HttpGet(url);
                request.setHeader("Content-Type", "application/json");
                HttpResponse response = apacheClient.execute(request);
                //return IOUtils.toString(response.getEntity().getContent(),
                     // StandardCharsets.UTF_8);
        }
        return null;
    }
}
