package com.etech.sprigintegrationapi.resttemplate.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

    private int statusCode;

    private Date date;

    private String message;

    private String description;


}

