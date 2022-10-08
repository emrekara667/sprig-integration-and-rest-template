package com.etech.sprigintegrationapi.messagehandler;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface SpaceShipGateWay {

    @Gateway(requestChannel = "spaceship")
    public SpaceShip spaceShipCreated(SpaceShip spaceShip);
}
