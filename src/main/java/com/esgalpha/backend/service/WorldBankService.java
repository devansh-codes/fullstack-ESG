package com.esgalpha.backend.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WorldBankService {

    private final RestTemplate restTemplate;

    // Spring automatically "injects" the RestTemplate bean we created earlier.
    public WorldBankService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Fetches GDP data for a given country from the World Bank API.
     * @param countryCode The 2-letter country code (e.g., "us", "cn").
     * @return A String containing the JSON response from the API.
     */
    public String getGdpData(String countryCode) {
        // This is the specific World Bank API URL for GDP (current US$)
        // It's structured to return data in JSON format.
        String url = "https://api.worldbank.org/v2/country/" + countryCode + "/indicator/NY.GDP.MKTP.CD?format=json";

        // Use the RestTemplate to make the GET request and return the response body as a String.
        return restTemplate.getForObject(url, String.class);
    }
}