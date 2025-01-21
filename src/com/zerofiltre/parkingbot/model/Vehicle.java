package com.zerofiltre.parkingbot.model;

/**
 * la classe de donnee et ses attributs
 */
public class Vehicle {

    private String registrationNumber;

    private String category;

    private String parkingSpotNumber;


    /**
     * les accesseurs pour chaque attributs
     * @return
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public VehicleModelEnum getCategory() {
        return VehicleModelEnum.VEHICLE;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    /**
     * methode qui permet de d'ecrire l'instance d'une classe (classe Vehicule)
     * @return
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }
}
