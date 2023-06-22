package org.assignments.secondweek.cars;

public abstract class Car {

    private String rentType;
    private int age;
    private String color;
    private int storageCapacity;
    private int price;

    public Car(String rentType, int age, String color, int storageCapacity, int price) {
        this.rentType = rentType;
        this.age = age;
        this.color = color;
        this.storageCapacity = storageCapacity;
        this.price = price;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int dailyPrice) {
        this.price = dailyPrice;
    }
}
