package com.zerofiltre.parkingbot.model;

import java.util.Date;

/**
 * les attributs
 */
public class Ticket {
    private String amount;
    private Vehicle vehicle;
    private Date enteringTime;
    private Date exitTime;


    /**
     * les accesseurs pour chaque attributs
     * @return
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(Date enteringTime) {
        this.enteringTime = enteringTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    /**
     * methode qui permet de d'ecrire l'instance d'une classe (classe Ticket)
     * @return
     */
    @Override
    public String toString() {
        return "Ticket{" +
                "amount='" + amount + '\'' +
                ", vehicle=" + vehicle +
                ", enteringTime=" + enteringTime +
                ", exitTime=" + exitTime +
                '}';
    }
}
