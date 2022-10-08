package com.etech.sprigintegrationapi.messagehandler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SpaceShipController {
    private final SpaceShipGateWay gateWay;

    @GetMapping("/api/spaceship/{name}")
    public SpaceShip newSpaceShip(@PathVariable String name){
        log.error("New SpaceShip Rest Begin");
        SpaceShip spaceShip = new SpaceShip(name);
        spaceShip = gateWay.spaceShipCreated(spaceShip);
        log.error(String.format("New SpaceShip Rest End %s", spaceShip));
        return spaceShip;
    }
}
