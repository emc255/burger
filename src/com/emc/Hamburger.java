package com.emc;

import java.util.LinkedList;

public  abstract class Hamburger {
    private String name;
    private MeatType meatType;
    private BreadRollType breadRollType;
    private LinkedList<AddOns> addOns;
    private double totalPrice = 0;

    public Hamburger(String name, MeatType meatType, BreadRollType breadRollType) {
        this.name = name;
        this.meatType = meatType;
        this.breadRollType = breadRollType;
        this.addOns = new LinkedList<>();
        this.totalPrice = getTotal();
    }

    public void addAddOn (AddOns addOns){
        this.addOns.add(addOns);
        this.totalPrice = getTotal();
    }

    public void printTotal() {
        System.out.println(getName());
        System.out.println("Bread: " +getBreadRollType().getName()+ " -> $" +getBreadRollType().getPrice());
        System.out.println("Meat: " +getMeatType().getName()+ " -> $" +getMeatType().getPrice());
        if(!this.addOns.isEmpty()) {
            for (AddOns addOn: this.addOns) {
                System.out.println("Added " +addOn.getName() + "-> $" +addOn.getPrice());
            }
        }
        System.out.println("Total: $" +this.totalPrice);
    }

    private double getTotal () {
        this.totalPrice = 0;
        this.totalPrice += (breadRollType.getPrice() + meatType.getPrice());
        if(!this.addOns.isEmpty()) {
            for (AddOns addOn: this.addOns) {
                this.totalPrice += addOn.getPrice();
            }
        }
        return this.totalPrice;
    }



    public String getName() {
        return name;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public LinkedList<AddOns> getAddOns() {
        return addOns;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
