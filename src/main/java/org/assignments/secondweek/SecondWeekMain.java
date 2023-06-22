package org.assignments.secondweek;

import org.assignments.secondweek.cars.Car;
import org.assignments.secondweek.cars.Hatchback;
import org.assignments.secondweek.cars.Sedan;
import org.assignments.secondweek.cars.Suv;
import org.assignments.secondweek.customers.CompanyCustomer;
import org.assignments.secondweek.customers.Customer;
import org.assignments.secondweek.customers.PersonCustomer;
import org.assignments.secondweek.manager.CarRepository;
import org.assignments.secondweek.manager.RentingManager;

import java.util.Scanner;

public class SecondWeekMain {
    public static void main(String[] args) {

        CarRepository carRepository = new CarRepository();
        RentingManager rentingManager = new RentingManager(carRepository);

        Customer customer = new CompanyCustomer();

        Car hatchBack1 = new Hatchback("günlük",3,"beyaz",120,35);
        Car hatchBack2 = new Hatchback("günlük",6,"gri",110,29);
        Car suv1 = new Suv("günlük",4,"beyaz",200,38);
        Car sedan1 = new Sedan("aylık",2,"beyaz",90,900);
        Car sedan2 = new Sedan("aylık",5,"siyah",100,860);
        Car suv2 = new Suv("günlük",7,"mavi",170,26);

        carRepository.addCar(hatchBack1);carRepository.addCar(hatchBack2);carRepository.addCar(suv1);
        carRepository.addCar(sedan1);carRepository.addCar(sedan2);carRepository.addCar(suv2);

        rentingManager.showCars(customer);

        Scanner scanner = new Scanner(System.in);

        System.out.print("index no girin : ");
        int index = scanner.nextInt();scanner.nextLine();

        System.out.print("aylık mı günlük mü : ");
        String type = scanner.nextLine();

        System.out.print("kaç "+type+  ": ");
        int time = scanner.nextInt();

        rentingManager.rent(customer,index,time,type);


    }
}
