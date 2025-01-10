package com.zerofiltre.parkingbot.service;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;
import com.zerofiltre.parkingbot.model.VehicleModelEnum;

import java.util.Date;


/**
 * classe de logique : gere les entree des vehicle pour le moment
 */
public class ParkingService {

    /**
     * Methode processIncomingVehicle qui retourne un ticket
     * creation de objet ticket et instanciation en utilisant un constructeur sans parametre
     * date d'entree du ticket
     * @param vehicle
     * @return ticket
     */
    public static Ticket processIncomingVehicle(Vehicle vehicle){
        Ticket ticket = new Ticket();
        Date now = new Date();
        ticket.setEnteringTime(now);
        ticket.setVehicle(vehicle);

        return  ticket;
    }

    public Ticket processExitingVehicule(Ticket ticket){
        long now = new  Date().getTime();
        now += 60 * 60 * 1000;

        Date exitTime = new Date(now);
        ticket.setExitTime(exitTime);

        double pricePerMinForCitadine = 0.08;
        double pricePerMinFor2Roues = 0.02;
        double defaultPricePerMin = 0.05;

        Vehicle vehicle = ticket.getVehicle();
        VehicleModelEnum category = vehicle.getCategory();

        long durationInMinutes = (ticket.getExitTime().getTime() - ticket.getEnteringTime().getTime()) / (60 * 1000);

        double finalPrice = 0;
        /*if("CITADINE".equals(category)) {
            finalPrice = durationInMinutes * pricePerMinForCitadine;
        } else if ("2 ROUES".equals(category)) {
            finalPrice = durationInMinutes * pricePerMinFor2Roues;
        }else {
            finalPrice = durationInMinutes * defaultPricePerMin;
        }*/

        switch (category){
            case CITADINE:
                finalPrice = durationInMinutes * pricePerMinForCitadine;
                break;
            case DEUXROUES:
                finalPrice = durationInMinutes * pricePerMinFor2Roues;
                break;
            default:
                finalPrice = durationInMinutes * defaultPricePerMin;

        }


        ticket.setAmount(finalPrice);
        return ticket;
    };


    public String parking = "Parking et surveilllance de vehicules";
    public String washing = "Nettoyage de vehicules";
}
