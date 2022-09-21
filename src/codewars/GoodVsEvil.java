package codewars;

import java.util.Arrays;

public class GoodVsEvil {

    public static void main(String[] args) {
        System.out.println(battle("2176 3508 3506 8411 9552 4484", "3427 1298 3494 9334 1990 8222 4101"));
    }

//    Middle Earth is about to go to war. The forces of good will have many battles with the forces of evil. Different races will certainly be involved. Each race has a certain worth when battling against others. On the side of good we have the following races, with their associated worth:
//
//    Hobbits: 1
//    Men: 2
//    Elves: 3
//    Dwarves: 3
//    Eagles: 4
//    Wizards: 10
//
//    On the side of evil we have:
//
//    Orcs: 1
//    Men: 2
//    Wargs: 2
//    Goblins: 2
//    Uruk Hai: 3
//    Trolls: 5
//    Wizards: 10
//
//    Although weather, location, supplies and valor play a part in any battle, if you add up the worth of the side of good and compare it with the worth of the side of evil, the side with the larger worth will tend to win.
//
//    Thus, given the count of each of the races on the side of good, followed by the count of each of the races on the side of evil, determine which side wins.

    public static String battle(String goodAmounts, String evilAmounts) {
        int[] goodWorth = new int[]{1, 2, 3, 3, 4, 10};
        int[] evilWorth = new int[]{1, 2, 2, 2, 3, 5, 10};

        String [] goodPointsArray = goodAmounts.split(" ");
        String [] evilPointsArray = evilAmounts.split(" ");

        int goodPointsTotal = 0;
        int evilPointsTotal = 0;

        for (int i = 0; i < goodPointsArray.length; i++) {
            goodPointsTotal += Integer.parseInt(goodPointsArray[i]) * goodWorth[i];
        }
        for (int i = 0; i < evilPointsArray.length; i++) {
            evilPointsTotal += Integer.parseInt(evilPointsArray[i]) * evilWorth[i];
        }

        if (goodPointsTotal > evilPointsTotal) {
            return "Battle Result: Good triumphs over Evil";
        }
        if (goodPointsTotal < evilPointsTotal) {
            return "Battle Result: Evil eradicates all trace of Good";
        }
        return "Battle Result: No victor on this battle field";
    }
}
