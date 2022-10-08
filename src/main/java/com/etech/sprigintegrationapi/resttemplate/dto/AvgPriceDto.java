package com.etech.sprigintegrationapi.resttemplate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvgPriceDto {
    private String mins;
    private BigDecimal price;
    private String symbol;
}

