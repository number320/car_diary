package com.example.myapplication;

import androidx.annotation.NonNull;

public class Vehicle {
    private String producer;
    private String model;
    private String vinCode;
    private double tankCapacity;
    private double startingDistance;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getStartingDistance() {
        return startingDistance;
    }

    public void setStartingDistance(double startingDistance) {
        this.startingDistance = startingDistance;
    }

    /*public void saveDataVehicle(){

    }*/

    /*@Override
    public String toString() {
        return "com.example.myapplication.Vehicle{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", vinCode='" + vinCode + '\'' +
                ", tankCapacity=" + tankCapacity +
                ", startingDistance=" + startingDistance +
                '}';
    }*/
}
