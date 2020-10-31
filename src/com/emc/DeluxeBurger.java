package com.emc;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe Burger", MeatType.BEACON_AND_SAUSAGE, BreadRollType.WHITE);
        super.addAddOn(AddOns.CHIPS);
        super.addAddOn(AddOns.DRINK);
    }

    @Override
    public void addAddOn(AddOns addOns) {
        if (getAddOns().size() < 2) {
            super.addAddOn(addOns);
        } else {
            System.out.println("Cannot add anymore add-on");
        }
    }
}
