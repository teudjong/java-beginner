package com.zerofiltre.parkinfbot;

public class ParkingBot {

    /**
     * ceci est la fonction principale d'un programme JAVA
     * @param args Represente les donnees passees en parametre lors du lancement du programme
     */
    public static void main(String[] args){
      sayHello(args[0]);
    }

    /**
     * Permet d'acceuillir et de presenter les services a l'utilisateur potentiel du parking
     * @param arg Represente le nom de l'utilisateur potentiel
     */

    private  static void  sayHello(String arg){
        String welcomeMessage = "Hello "+ arg + ", bienvenu au parking Zerofiltre";
        String services = "Nous offrons les services suivants: Gardinage, laverie...";
        String warning = "Depechez-vous d'entrer car il n'y aura bientot plus de places!";
        System.out.println(welcomeMessage);
        System.out.println(services);
        System.out.println(warning.toUpperCase());
    }
}
