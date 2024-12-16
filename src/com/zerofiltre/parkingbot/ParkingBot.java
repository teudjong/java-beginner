package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.service.ParkingService;

public class ParkingBot {


    static String completion = "des equipes du parking Zerofiltre";
    static ParkingService parkingService = new ParkingService();

    /**
     * ceci est la fonction principale d'un programme JAVA
     * @param args Represente les donnees passees en parametre lors du lancement du programme
     */
    public static void main(String[] args){
      sayHello(args[0]);
      sayBaye();
    }

    /**
     * Permet d'acceuillir et de presenter les services a l'utilisateur potentiel du parking
     * @param arg Represente le nom de l'utilisateur potentiel
     */


    private  static void  sayHello(String arg){
        String welcomeMessage = "Hello "+ arg + ", bienvenue au parking Zerofiltre " + completion;
        String services = "Nous offrons les services suivants: Gardinage, laverie...";
        String warning = "Depechez-vous d'entrer car il n'y aura bientot plus de places!";
        String parkService = parkingService.parking;
        String washingService = parkingService.washing;

        System.out.println(welcomeMessage);
        System.out.println(services);
        System.out.println(warning.toUpperCase());
        System.out.println("Nous proposons les services suivants: " + parkService + " ET " + washingService);
    }

    private static void  sayBaye(){
        System.out.println("Recevez les aurevoirs " + completion);
    }
}
