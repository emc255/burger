package com.emc;

public enum BreadRollType {
    WHITE("White Bread", 1.99),
    WHEAT("Wheat Bread", 1.49),
    BROWN_RYE("Brown Rye Roll", 1.25);

    private final String name;
    private final double price;

    BreadRollType(String name, double price) {
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
