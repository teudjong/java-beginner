package com.teudjong.parkingbot.model;

import java.util.Date;

/**
 * la classe de donnees et ses attributs
 */
public class Ticket {
    private double amount;
    private Vehicle vehicle;
    private Date enteringTime;
    private Date exitTime;


    /**
     * les accesseurs pour chaque attributs
     * @return
     */
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
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
        return "Ticket d'un montant de: "+amount+ " $ pour vehicle de type "+ vehicle.getCategory() +
                " entre a "+ enteringTime+ " et sorti a "+ exitTime;
    }
}
