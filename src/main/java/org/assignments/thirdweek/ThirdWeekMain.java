package org.assignments.thirdweek;

import org.assignments.thirdweek.airways.TurkishAirways;
import org.assignments.thirdweek.entity.Customer;
import org.assignments.thirdweek.services.CateringService;

public class ThirdWeekMain {
    public static void main(String[] args) {
        TurkishAirways thy = new TurkishAirways(40);
        thy.addCity("Bursa",500);
        thy.showSeatingPlan();
        System.out.println();
        Customer ahmet = new Customer("Ahmet","Bungalov",2673723,"09/09/1990");
        thy.addPassenger(ahmet,"K3","Bursa");
        thy.showSeatingPlan();
        System.out.println(thy.getFlightNumber());
        thy.cateringService();

        CateringService turkish = new TurkishAirways(30);

        System.out.println(turkish.getClass().toString());
    }
}
