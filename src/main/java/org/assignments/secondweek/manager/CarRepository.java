package org.assignments.secondweek.manager;

import org.assignments.secondweek.cars.Car;
import org.assignments.secondweek.customers.Customer;
import org.assignments.secondweek.services.CarRepositoryService;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements CarRepositoryService {

    public List<Car> allCars = new ArrayList<>();

    public CarRepository() {
    }

    @Override
    public List<Car> getCarList(Customer customer) {

        String customerType = customer.getType();

        List<Car> cars = new ArrayList<>();
        if(customerType.equals("CompanyCustomer")){
            allCars.forEach(car -> {
                if(!car.getClass().getSimpleName().equals("Hatchback")){
                    cars.add(car);
                }
            });
        }

        else if(customerType.equals("PersonCustomer")){
            this.allCars.forEach(car -> {
                if(!car.getClass().getSimpleName().equals("Sedan")){
                    cars.add(car);
                }
            });
        }
        return cars;
    }

    public Car getCar(Customer customer,int index) {

        String customerType = customer.getType();
        List<Car> cars = new ArrayList<>();

        if(customerType.equals("CompanyCustomer")){
            allCars.forEach(car -> {
                if(!car.getClass().getSimpleName().equals("Hatchback")){
                    cars.add(car);
                }
            });
        }

        else if(customerType.equals("PersonCustomer")){
            allCars.forEach(car -> {
                if(!car.getClass().getSimpleName().equals("Sedan")){
                    cars.add(car);
                }
            });
        }
        return cars.get(index);
    }

    public void addCar(Car car){
        this.allCars.add(car);
    }

    public boolean deleteCar(Car car){
        return this.allCars.remove(car);
    }

    public List<Car> getAllCars() {
        return allCars;
    }
}
