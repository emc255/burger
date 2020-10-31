package com.emc;

public enum AddOns {
    CHEESE("Cheese", 1.00),
    DRINK("Drink", .99),
    CHIPS("Chips", .85),
    LETTUCE("Lettuce", .50);

    private final String name;
    private final double price;

    AddOns(String name, double price) {
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
