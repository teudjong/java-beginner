package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.model.Bicycle;
import com.zerofiltre.parkingbot.model.Car;
import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;
import com.zerofiltre.parkingbot.service.ParkingService;

import java.security.SecureRandom;
import java.util.*;

public class ParkingBot {


    static String completion = "des equipes du parking Zerofiltre";
    static ParkingService parkingService = new ParkingService();
    static String[] customers ={"Ebenezaire","Raissa","Chloe","Krishna","Kim","Serena","Ghislaine","Estelle","Merveille","Chanelle","Ines"};
    static  int parkingSize = new SecureRandom().nextInt(10);


    /**
     * classe principale
     * ceci est la fonction principale d'un programme JAVA
     * traitement d'un vehicule
     * @param args Represente tableaux des donnees passees en parametre lors du lancement du programme
     */
    public static void main(String[] args) {
//      boucleFor();
//        boucleWhile();
//        sayBaye();
       processVehicles();
       /* int a = 10;
        int b = a;
        System.out.println("a =>"+ a);
        System.out.println("b =>"+ b);
        a = 15;
        System.out.println("a =>"+ a);
        System.out.println("b =>"+ b);
        a = 0;
        System.out.println("a =>"+ a);
        System.out.println("b =>"+ b);*/
    }

    /**
     * initialisation d'une liste
     * initialisation d'un Set
     * ajout d'un elemnt dans une liste et un Set avec la methode Add
     */
    private static void processVehicles() {

        Set<Ticket> tickets = new HashSet<>();

        Vehicle vehicle = new Vehicle();
        vehicle.setRegistrationNumber("LS-458-4P");
        Ticket vehicleTicket = ParkingService.processIncomingVehicle(vehicle);
        tickets.add(vehicleTicket);
        System.out.println(vehicleTicket);

        Vehicle bicycle = new Bicycle();
        bicycle.setRegistrationNumber("FO-526-PM");
        Ticket bicycleTicket = parkingService.processIncomingVehicle(bicycle);
        tickets.add(bicycleTicket);
        System.out.println(bicycleTicket);

        Vehicle car = new Car();
        car.setRegistrationNumber("JDI-48-SOS");
        Ticket carTicket = parkingService.processIncomingVehicle(car);
        tickets.add(carTicket);
        System.out.println(carTicket);

        System.out.println(parkingService.processExitingVehicule(vehicleTicket));
        System.out.println(parkingService.processExitingVehicule(bicycleTicket));
        System.out.println(parkingService.processExitingVehicule(carTicket));

        /**
         * initialisation d'un tableau
         * ajout des elemments dans un tableau a des positions precises
         */
       /* Ticket[] tickets = new Ticket[3];
        tickets[0] = vehicleTicket;
        tickets[1] = bicycleTicket;
        tickets[2] = carTicket;*/

        System.out.println("Traitement des sorties par lot");

        /**
         * initialisation d'une map pour pouvoir recuperer deux donnees(une donnee qui represente la cle:un Integer et un objet ticket)
         * parcourir un tableau soit a partir d'une boucle ameliorer ou une boucle avec compteur
         */
        Map<Integer, Ticket> exitOrder = new HashMap<>();
        int position = 0;

        for (Ticket ticket : tickets){
            exitOrder.put(position,ticket);
            position++;
            System.out.println(parkingService.processExitingVehicule(ticket));
        }

       /* for (Ticket ticket : tickets) {
            System.out.println(parkingService.processExitingVehicule(ticket));
        }*/

        /**
         * comment parcourir une Map(recuperer ensemble des cles de la map , faire une boucle sur la Map, et on recupere element qui correspond a chaque cle avec le nom de la Map.gewt(key))
         */
        Set<Integer> keySet = exitOrder.keySet();
        for (int key: keySet){
            System.out.println("Position dans la liste : "+key + " : "+ exitOrder.get(key).getVehicle().getCategory());
        }
    }

    private static void boucleFor() {
        for (int i = 0; i < customers.length; i++) {
            sayHello(customers[i]);
        }
        for (String customer:customers){
             sayHello(customer);
         }
    }


    private static void boucleWhile() {
        System.out.println("nous avons " + parkingSize + "place(s) restante(s)");
        int customerNumber = 0;
        while (parkingSize > 0) {
            parkingSize--;

            if("Chloe".equals(customers[customerNumber])){
                customerNumber++;
                parkingSize++;
                continue;
            }

            if ("Krishna".equals(customers[customerNumber])){
                break;
            }
            sayHello(customers[customerNumber]);
            customerNumber++;
            System.out.println();
        }
    }


    /**
     * Permet d'acceuillir et de presenter les services a l'utilisateur potentiel du parking
     * @param customer Represente le nom de l'utilisateur potentiel ou le client a qui on dit Hello
     */
    private  static void  sayHello(String customer){
        String welcomeMessage = "Hello "+ customer + ", bienvenue au parking Zerofiltre " + completion;
        String services = "Nous offrons les services suivants: Gardinage, laverie...";
        String warning = "Depechez-vous d'entrer car il n'y aura bientot plus de places!";
        String parkService = parkingService.parking;
        String washingService = parkingService.washing;
        String welcomeSentence = "Hello " + customer;

        System.out.println(welcomeMessage);
        System.out.println(services);
        System.out.println(warning.toUpperCase());
        System.out.println("Nous proposons les services suivants: " + parkService + " ET " + washingService);
        System.out.println(welcomeSentence);
    }

    private static void  sayBaye(){
        System.out.println("Recevez les aurevoirs " + completion);
    }
}
