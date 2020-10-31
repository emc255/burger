package com.emc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        start();

//        BasicBurger basicBurger = new BasicBurger(MeatType.ANGUS,BreadRollType.WHITE);
//        basicBurger.addAddOn(AddOns.LETTUCE);
//        basicBurger.printTotal();
//
//        HealthyBurger healthyBurger = new HealthyBurger(MeatType.CHICKEN);
//        healthyBurger.addAddOn(AddOns.LETTUCE);
//        healthyBurger.addAddOn(AddOns.LETTUCE);
//        healthyBurger.addAddOn(AddOns.LETTUCE);
//        healthyBurger.addAddOn(AddOns.LETTUCE);
//        healthyBurger.addAddOn(AddOns.LETTUCE);
//        healthyBurger.addAddOn(AddOns.LETTUCE);
//        healthyBurger.printTotal();
//        healthyBurger.addAddOn(AddOns.LETTUCE);
//
//        DeluxeBurger deluxeBurger = new DeluxeBurger();
//        deluxeBurger.printTotal();

    }

    public static void UserChoice(int choice) {
        int breadChoice = 0;
        switch (choice) {
            case 1:
                System.out.println("Basic Burger");
                break;
            case 2:
                System.out.println("Deluxe Burger");
                break;
            default:
                System.out.println("Thank You");;
                break;
        }
    }

    public static void start() {
        Scanner sc = new Scanner(System.in);
        Menu();
        while(true) {
            if(sc.hasNextInt()) {
                int choice = sc.nextInt();
                if(choice < 0 || choice > 2) {
                    Menu();
                } else {
                    UserChoice(choice);
                    break;
                }
            } else {
                Menu();
            }
            sc.nextLine();
        }
        sc.close();
    }

    public static void Menu() {
        System.out.println("Welcome, Please Choose Your Burger");
        System.out.println("0 -> Quit");
        System.out.println("1 -> Basic Burger");
        System.out.println("2 -> Deluxe Burger");

    }

    public static void chooseBread() {
        System.out.println("Choose Bread Type");
        System.out.println("0 -> Quit");
        System.out.println("1 -> " +BreadRollType.WHEAT.getName()+ " = $" +BreadRollType.WHEAT.getPrice());
        System.out.println("1 -> " +BreadRollType.WHITE.getName()+ " = $" +BreadRollType.WHITE.getPrice());
        System.out.println("3 -> Back");
    }
    public static int getUserChoice() {
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()) {
            if(sc.hasNextInt()) {
                return sc.nextInt();
            }
            sc.nextLine();
        }
        sc.close();
        return -1;
    }

    public static void sample(Food food){

    }



}
