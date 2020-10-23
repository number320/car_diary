package com.example.myapplication;

public class AverageConsuption implements AverageCost{
    private double lastRefuelingQuantity;
    private int totalDistance;
    private double lastRefuelingDistance;
    private double pricePerLiter;

    public double getLastRefuelingQuantity() {
        return lastRefuelingQuantity;
    }

    public void setLastRefuelingQuantity(double lastRefuelingQuantity) {
        this.lastRefuelingQuantity = lastRefuelingQuantity;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    public double getLastRefuelingDistance() {
        return lastRefuelingDistance;
    }

    public void setLastRefuelingDistance(double lastRefuelingDistance) {
        this.lastRefuelingDistance = lastRefuelingDistance;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }
}
