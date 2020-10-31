package com.emc;

public class HealthyBurger extends Hamburger {
    public HealthyBurger(MeatType meatType) {
        super("Healthy Burger", meatType, BreadRollType.BROWN_RYE);
    }

    @Override
    public void addAddOn(AddOns addOns) {
        if (getAddOns().size() < 6) {
            super.addAddOn(addOns);
        } else {
            System.out.println("Cannot add anymore add-on");
        }
    }
}
