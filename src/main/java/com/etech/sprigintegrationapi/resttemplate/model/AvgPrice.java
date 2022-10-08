package com.etech.sprigintegrationapi.resttemplate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvgPrice {
    private String mins;
    private BigDecimal price;
    private String symbol;
}


