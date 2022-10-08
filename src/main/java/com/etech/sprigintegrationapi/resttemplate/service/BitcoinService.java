package com.etech.sprigintegrationapi.resttemplate.service;


import com.etech.sprigintegrationapi.resttemplate.converter.AvgPriceDtoConverter;
import com.etech.sprigintegrationapi.resttemplate.dto.AvgPriceDto;
import com.etech.sprigintegrationapi.resttemplate.model.AvgPrice;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BitcoinService {

    private final RestTemplate restTemplate;
    private final AvgPriceDtoConverter converter;

    public BitcoinService(RestTemplate restTemplate, AvgPriceDtoConverter converter) {
        this.restTemplate = restTemplate;
        this.converter = converter;
    }

    public AvgPriceDto getAvgPrice(String symbol){
        AvgPrice avgPrice = restTemplate.getForObject("https://api1.binance.com/api/v3/avgPrice?symbol=" + symbol, AvgPrice.class);
        assert avgPrice != null;
        avgPrice.setSymbol(symbol);
        return converter.convert(avgPrice);
    }
}
