package main;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {

    public static void main(String[] args) {

    int [] candies = {6,6,6,6};

//    maxProfit(prices);
//        System.out.println(distributeCandies(candies));

//        System.out.println(fib(4));
        System.out.println(isAnagram("anagram", "nagaram"));


    }
    public static boolean isAnagram(String s, String t) {

        int firstStringVal = 0;
        int secondStringVal = 0;



        String[] firstStringChars = s.split("");
        String[] secondStringChars = t.split("");


        ArrayList<String> firstCharsArrayList = new ArrayList<>();

        if (firstStringChars.length != secondStringChars.length) {
            return false;
        }

        for (int i = 0; i < firstStringChars.length; i++) {
            firstCharsArrayList.add(firstStringChars[i]);
            firstStringVal += firstStringChars[i].codePointAt(0);
        }

        for (int i = 0; i < secondStringChars.length; i++) {

            if (!firstCharsArrayList.contains(secondStringChars[i])) {
                return false;
            }

            secondStringVal += secondStringChars[i].codePointAt(0);
        }

        System.out.println(firstStringVal);
        System.out.println(secondStringVal);

        if (firstStringVal == secondStringVal) {
            return true;
        }
        return false;
    }

    public static int distributeCandies(int[] candyType) {
        ArrayList<Integer> uniCandies = new ArrayList<>();

        for (int i = 0; i < candyType.length; i++) {
            int currentCandy = candyType[i];
            if (!uniCandies.contains(currentCandy)) {
                uniCandies.add(currentCandy);
            }
        }

        if (candyType.length / 2 < uniCandies.size()) {
            return candyType.length / 2;
        }

        return uniCandies.size();
    }


    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static int maxProfit(int [] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            int priceOfDay = prices[i];
            int priceOfPreviousDay = 0;

            if (i != 0) {
                priceOfPreviousDay = prices[i - 1];
            }
            int dailyProfit = getDailyProfit(priceOfPreviousDay, priceOfDay);


            if (priceOfDay > priceOfPreviousDay) {

            }


        }

        return 1;
    }

    public static int getDailyProfit(int buyPrice, int sellPrice) {
        return sellPrice - buyPrice;
    }
}
