package Groceies;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryApp {

    private static HashMap<String, ArrayList<Groceries>> testList = new HashMap<>();

    private static ArrayList<Groceries> produceArray = new ArrayList<>();
    private static ArrayList<Groceries> meatArray = new ArrayList<>();
    private static ArrayList<Groceries> dryGoodArray = new ArrayList<>();
    private static ArrayList<Groceries> frozenArray = new ArrayList<>();
    private static ArrayList<Groceries> drinksArray = new ArrayList<>();

    public static void main(String[] args) {

        Input input = new Input();

        while (input.yesNo("Would you like to make a grocery list? y/n: ")) {
            if (input.yesNo("would you like to enter a new item? y/n: ")) {
                do {

                    printCategories();
                    int userChoice = input.getInt(1, 5);

                    addFoodObjects(userChoice, input);

                } while (input.yesNo("Add more items? (y) or finalize list? (enter)"));

                testList.put("Produce", produceArray);
                testList.put("Meats", meatArray);
                testList.put("Dry goods", dryGoodArray);
                testList.put("Frozen", frozenArray);
                testList.put("Drinks", drinksArray);


                printLists(testList, "Produce");
                printLists(testList, "Meats");
                printLists(testList, "Dry goods");
                printLists(testList, "Frozen");
                printLists(testList, "Drinks");


            }
        }
    }

    public static void printCategories() {
        System.out.println("Pick from the categories below..");
        System.out.println("1. Produce");
        System.out.println("2. Meat");
        System.out.println("3. Dry Goods");
        System.out.println("4. Frozen");
        System.out.println("5. Drinks");
    }

    public static void addFoodObjects(int userChoice, Input input) {
        if (userChoice == 1) {
            String foodname = input.getString("Enter food name: ");
            int foodAmount = input.getInt("Enter amount: ");
            produceArray.add(new Groceries(foodname, foodAmount));
        }
        if (userChoice == 2) {
            String foodname = input.getString("Enter food name: ");
            int foodAmount = input.getInt("Enter amount: ");
            meatArray.add(new Groceries(foodname, foodAmount));
        }
        if (userChoice == 3) {
            String foodname = input.getString("Enter food name: ");
            int foodAmount = input.getInt("Enter amount: ");
            dryGoodArray.add(new Groceries(foodname, foodAmount));
        }
        if (userChoice == 4) {
            String foodname = input.getString("Enter food name: ");
            int foodAmount = input.getInt("Enter amount: ");
            frozenArray.add(new Groceries(foodname, foodAmount));
        }
        if (userChoice == 5) {
            String foodname = input.getString("Enter food name: ");
            int foodAmount = input.getInt("Enter amount: ");
            drinksArray.add(new Groceries(foodname, foodAmount));
        }
    }

    public static void printLists(HashMap<String, ArrayList<Groceries>> list, String category) {

        System.out.println(category + ": ");
        for (int i = 0; i < list.get(category).size(); i++) {
            System.out.println("\t" + list.get(category).get(i).getName() + ": " + list.get(category).get(i).getAmount());
        }
    }

}
