package com.etech.sprigintegrationapi.messagehandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip{

    private String name;
    private Double fuel=15.0d;

    public SpaceShip(String name) {
        this.name = name;
    }
}
