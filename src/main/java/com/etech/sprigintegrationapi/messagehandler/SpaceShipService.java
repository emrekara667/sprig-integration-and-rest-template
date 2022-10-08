package com.etech.sprigintegrationapi.messagehandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SpaceShipService {

    @ServiceActivator(inputChannel = "spaceship", outputChannel = "fuel")
    public SpaceShip renamed(SpaceShip spaceShip){
        log.error(String.format("Rename SpaceShip BEGIN %s", spaceShip));
        spaceShip.setName(spaceShip.getName().toUpperCase());
        log.error(String.format("Rename SpaceShip END %s", spaceShip));
        return spaceShip;
    }

    @ServiceActivator(inputChannel = "launcher")
    public SpaceShip renamedHappened(SpaceShip spaceShip){
        log.error(String.format("A spaceShip has been launched!!!! %s", spaceShip));
        return spaceShip;
    }

    @ServiceActivator(inputChannel = "fuel", outputChannel = "launcher")
    public SpaceShip fuel(SpaceShip spaceShip){
        log.error(String.format("Fuel SpaceShip BEGIN %s ",spaceShip));
        spaceShip.setFuel(100.0d);
        log.error(String.format("Fuel SpaceShip END %s ",spaceShip));
        return spaceShip;
    }
}
