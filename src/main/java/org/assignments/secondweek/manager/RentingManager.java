package org.assignments.secondweek.manager;

import org.assignments.secondweek.cars.Car;
import org.assignments.secondweek.customers.Customer;

import java.util.Date;
import java.util.List;

public class RentingManager {

    CarRepository carRepositoryService;

    public RentingManager(CarRepository carRepositoryService) {
        this.carRepositoryService = carRepositoryService;
    }

    public void showCars(Customer customer){
        List<Car> cars = carRepositoryService.getCarList(customer);
        //System.out.println(cars.size());
        for (int i = 0; i < carRepositoryService.getCarList(customer).size(); i++) {
            System.out.println();

            System.out.println("Index : " + i +" "+ cars.get(i).getClass().getSimpleName()+"---------------------------------------");
            System.out.println("KİRALAMA TİPİ : "+cars.get(i).getRentType());
            System.out.println("1 "+cars.get(i).getRentType()+" için "+"kiralama bedeli : "+cars.get(i).getPrice());
            System.out.println("RENK : "+ cars.get(i).getColor());
            System.out.println("ARAÇ YAŞ : "+ cars.get(i).getAge());
            System.out.println("BAGAJ KAPASİTE : "+ cars.get(i).getStorageCapacity());

        }
        System.out.println();
    }

    public boolean rent(Customer customer,int index,int time,String type){
        int totalPrice = 0;
        Car car = carRepositoryService.getCar(customer,index);
        if(car.getRentType().equals(type)) totalPrice = car.getPrice()*time;
        else if(car.getRentType().equals("aylık")) {
            System.out.println("Bu aracı günlük kiralayamazsınız.");
            return false;
        }
        else totalPrice = car.getPrice()*time*30;

        System.out.println(time+ " "+type + "için ödeyeceğiniz miktar : "+ totalPrice);

        customer.setRentDate(new Date());
        customer.setRentedCar(car);
        customer.setRentPeriod(String.valueOf(time)+" "+type);

        return true;
    }








}
