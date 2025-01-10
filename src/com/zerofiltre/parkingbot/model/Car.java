package com.zerofiltre.parkingbot.model;

public class Car extends  Vehicle{

    @Override
    public VehicleModelEnum getCategory() {
        return VehicleModelEnum.CITADINE;
    }
}
