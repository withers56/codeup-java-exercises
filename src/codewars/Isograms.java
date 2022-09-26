package codewars;

import java.util.ArrayList;

public class Isograms {
//    An isogram is a word that has no repeating letters, consecutive or
//    non-consecutive. Implement a function that determines whether a string
//    that contains only letters is an isogram. Assume the empty string is
//    an isogram. Ignore letter case.

    public static void main(String[] args) {
        System.out.println(isIsogram("ad1"));
    }

    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        ArrayList<Character> charsInWord = new ArrayList<>();


        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                return false;
            }
            if (charsInWord.contains(str.charAt(i))) {
                return false;
            }
            charsInWord.add(str.charAt(i));
        }


        return true;
    }
}
