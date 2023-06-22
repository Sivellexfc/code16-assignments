package org.assignments.secondweek.customers;

import org.assignments.secondweek.cars.Car;

import java.util.Date;

public abstract class Customer {
    private Car rentedCar;
    private Date rentDate;
    private String rentPeriod;

    public Car getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(Car rentedCar) {
        this.rentedCar = rentedCar;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public String getRentPeriod() {
        return rentPeriod;
    }

    public void setRentPeriod(String rentPeriod) {
        this.rentPeriod = rentPeriod;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "rentedCar=" + rentedCar +
                ", rentDate=" + rentDate +
                ", rentPeriod='" + rentPeriod + '\'' +
                '}';
    }
}
