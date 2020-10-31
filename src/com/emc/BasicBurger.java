package com.emc;

public class BasicBurger extends Hamburger {

    public BasicBurger(MeatType meatType, BreadRollType breadRollType) {
        super("Basic Burger", meatType, breadRollType);
    }

    @Override
    public void addAddOn(AddOns addOns) {
        if (getAddOns().size() < 4) {
            super.addAddOn(addOns);
        } else {
            System.out.println("Cannot add");
        }
    }
}
