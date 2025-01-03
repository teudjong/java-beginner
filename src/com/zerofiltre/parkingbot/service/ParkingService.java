package com.zerofiltre.parkingbot.service;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;

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
    public Ticket processIncomingVehicle(Vehicle vehicle){
        Ticket ticket = new Ticket();
        Date now = new Date();
        ticket.setEnteringTime(now);
        ticket.setVehicle(vehicle);

        return  ticket;
    }


    public String parking = "Parking et surveilllance de vehicules";
    public String washing = "Nettoyage de vehicules";
}
