package com.teudjong.parkingbot.model.service;

import com.teudjong.parkingbot.model.Ticket;
import com.teudjong.parkingbot.model.Vehicle;
import com.teudjong.parkingbot.service.ParkingService;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ParkingServiceTest {
    public static final String REGISTRATION_NUMBER = "AZ-OIS-8888";
    private ParkingService parkingService;

    // Soit un vehicule a entree  du parking avec une plaque d'immatriculation x
    // Enregistrer ce vehicule

    // Genere un tocket

    // Associe au vehicule de la plaque x avec comme date d'entree la date actuelle ave 30 seconde pres

    @Test
    void givenAVehicule_processIncommingVehicule_generatesTicketWithRightTime() {

        //given
        Vehicle vehicle = new Vehicle();
        Vehicle.setRegistrationNumber(REGISTRATION_NUMBER);
        Date now = new Date();

        //when
        Ticket ticket = parkingService.processIncommingVehicule(vehicle);

        //then
        assertThat(ticket).isNotNull();
        Vehicle registeredVehicle = ticket.getVehicle();
        assertThat(registeredVehicle).isNotNull();
        String registeredRegistrationNumber = registeredVehicle.getRegistrationNumber();
        assertThat(registeredRegistrationNumber).isEqualsTo(REGISTRATION_NUMBER);
        Date date = ticket.getEnteringTime();
        assertThat(date).isNotNull();
        Date nowPlus30Seconds = new Date(Now.getTime() + 30 * 1000);

    }
}
