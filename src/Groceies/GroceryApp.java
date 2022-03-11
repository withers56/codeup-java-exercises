package Groceies;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryApp {

    public static void main(String[] args) {

        Input input = new Input();

        Meat steak = new Meat("Steak", 4);
        Meat chicken = new Meat("Chicken", 8);

        Produce broccoli = new Produce("Broccoli", 2);

        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
        HashMap<String, Integer> meats = new HashMap<>();
        HashMap<String, Integer> produce = new HashMap<>();
        HashMap<String, Integer> dryGoods = new HashMap<>();
        HashMap<String, Integer> frozen = new HashMap<>();
        HashMap<String, Integer> drinks = new HashMap<>();


//        meats.put(chicken.getName(), chicken.getAmount());
//        meats.put(steak.getName(), steak.getAmount());
//        produce.put(broccoli.getName(), broccoli.getAmount());
//        System.out.println(meats);
//
//        list.add(meats);
//        list.add(produce);
//        System.out.println(list);


        while (input.yesNo("Would you like to make a grocery list? y/n: ")) {
            if(input.yesNo("would you like to enter a new item? y/n: ")) {
                do {
                    System.out.println("Pick from the categories below..");
                    System.out.println("1. Produce");
                    System.out.println("2. Meat");
                    System.out.println("3. Dry Goods");
                    System.out.println("4. Frozen");
                    System.out.println("5. Drinks");
                    int userChoice = input.getInt(1, 5);

                    if (userChoice == 1) {
                        String foodname = input.getString("Enter food name: ");
                        int foodAmount = input.getInt("Enter amount: ");
                        produce.put(foodname,foodAmount);
                    }
                    if (userChoice == 2) {
                        String foodname = input.getString("Enter food name: ");
                        int foodAmount = input.getInt("Enter amount: ");
                        meats.put(foodname,foodAmount);
                    }
                    if (userChoice == 3) {
                        String foodname = input.getString("Enter food name: ");
                        int foodAmount = input.getInt("Enter amount: ");
                        dryGoods.put(foodname,foodAmount);
                    }
                    if (userChoice == 4) {
                        String foodname = input.getString("Enter food name: ");
                        int foodAmount = input.getInt("Enter amount: ");
                        frozen.put(foodname,foodAmount);
                    }
                    if (userChoice == 5) {
                        String foodname = input.getString("Enter food name: ");
                        int foodAmount = input.getInt("Enter amount: ");
                        drinks.put(foodname,foodAmount);
                    }


                } while (input.yesNo("Add more items? (y) or finalize list? (enter)"));


                list.add(produce);
                list.add(meats);
                list.add(dryGoods);
                list.add(frozen);
                list.add(drinks);

                for (int i = 0; i < list.size(); i++) {
                    if (i == 0) {
                        System.out.print("Produce: ");
                        System.out.println(list.get(i));
                    }
                    if (i == 1) {
                        System.out.print("Meat: ");
                        System.out.println(list.get(i));
                    }
                    if (i == 2) {
                        System.out.print("Dry goods: ");
                        System.out.println(list.get(i));
                    }
                    if (i == 3) {
                        System.out.print("Frozen: ");
                        System.out.println(list.get(i));
                    }
                    if (i == 4) {
                        System.out.print("Drinks: ");
                        System.out.println(list.get(i));
                    }
                }
            }
        }
    }
}
