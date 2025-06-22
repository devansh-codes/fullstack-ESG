package com.esgalpha.backend.service;

import org.springframework.stereotype.Service;

@Service
public class RefinitivService {

    /**
     * Placeholder method to "fetch" ESG data for a company.
     * In a real application, this would call the Refinitiv API after authentication.
     * @param ric The Refinitiv Identification Code for the company (e.g., "MSFT.O").
     * @return A String containing mock JSON ESG data.
     */
    public String getEsgDataForCompany(String ric) {
        // This is mock data that mimics a real API response.
        return "{\"companyRIC\":\"" + ric + "\",\"esgScore\":85,\"environmentPillar\":80,\"socialPillar\":90,\"governancePillar\":88}";
    }
}