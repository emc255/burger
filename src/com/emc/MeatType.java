package com.emc;

public enum MeatType {
    ANGUS("Angus", 2.00),
    BEACON("Beacon", 1.25),
    BEACON_AND_SAUSAGE("Beacon and Sausage", 4.25),
    CHICKEN("Chicken", 1.50);

    private final String name;
    private final double price;

    MeatType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
