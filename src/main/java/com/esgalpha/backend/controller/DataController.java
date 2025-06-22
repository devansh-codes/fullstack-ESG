package com.esgalpha.backend.controller;

import com.esgalpha.backend.service.RefinitivService;
import com.esgalpha.backend.service.WorldBankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data") // Base path for all endpoints in this controller
public class DataController {

    private final WorldBankService worldBankService;
    private final RefinitivService refinitivService;

    public DataController(WorldBankService worldBankService, RefinitivService refinitivService) {
        this.worldBankService = worldBankService;
        this.refinitivService = refinitivService;
    }

    @GetMapping("/worldbank/gdp/{countryCode}")
    public String getGdpData(@PathVariable String countryCode) {
        return worldBankService.getGdpData(countryCode);
    }

    @GetMapping("/refinitiv/esg/{ric}")
    public String getEsgData(@PathVariable String ric) {
        return refinitivService.getEsgDataForCompany(ric);
    }
}