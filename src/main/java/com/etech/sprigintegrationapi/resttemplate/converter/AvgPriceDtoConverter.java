package com.etech.sprigintegrationapi.resttemplate.converter;

import com.etech.sprigintegrationapi.resttemplate.dto.AvgPriceDto;
import com.etech.sprigintegrationapi.resttemplate.model.AvgPrice;
import org.springframework.stereotype.Component;

@Component
public class AvgPriceDtoConverter {

    public AvgPriceDto convert(AvgPrice from){
        return new AvgPriceDto(from.getMins(), from.getPrice(), from.getSymbol());
    }
}
