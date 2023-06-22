package org.assignments.secondweek.services;

import org.assignments.secondweek.cars.Car;
import org.assignments.secondweek.customers.Customer;

import java.util.List;

public interface CarRepositoryService {

    public List<Car> getCarList(Customer customer);
}
