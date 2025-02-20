package com.teudjong.parkingbot.model;

public class Bicycle extends Vehicle{

    @Override
    public VehicleModelEnum getCategory() {
        return VehicleModelEnum.DEUXROUES;
    }
}
