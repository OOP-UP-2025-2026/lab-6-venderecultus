package org.example;

interface GPS {
    double[] getCoordinates();
}

interface Cellular {
    void makeCall();
    void receiveCall();
}

public class Smartphone implements GPS, Cellular {

    private double currentLatitude;
    private double currentLongitude;

    public Smartphone(double latitude, double longitude) {
        this.currentLatitude = latitude;
        this.currentLongitude = longitude;
    }

    @Override
    public double[] getCoordinates() {
        return new double[]{this.currentLatitude, this.currentLongitude};
    }

    @Override
    public void makeCall() {
        System.out.println("Making a call...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving a call...");
    }

    public void updateLocation(double lat, double lon) {
        this.currentLatitude = lat;
        this.currentLongitude = lon;
    }
}