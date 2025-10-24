package org.example;

interface Comparable {
    void compareTo(Car another);
}

public class Car implements Comparable {

    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Object o) {
        Car otherCar = (Car) o;

        if (this.price != otherCar.price) {
            return otherCar.price - this.price;
        }

        if (this.year != otherCar.year) {
            return this.year - otherCar.year;
        }

        return this.horsePower - otherCar.horsePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}