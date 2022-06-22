package leetcodes;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidPalindrome {
//    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
//    non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        isPalindrome(s);
    }

    public static boolean isPalindrome(String s) {

        ArrayList<String> sortedString = new ArrayList<>();

        //remove all special characters
        for (int i = 0; i < s.length(); i++) {
            char currentLetter = Character.toLowerCase(s.charAt(i));
            System.out.println(currentLetter);
            int currentLetterASCII = currentLetter;

            if (currentLetterASCII <= 122 && currentLetterASCII >= 97) {
                sortedString.add(String.valueOf(currentLetter));
            }
        }
        System.out.println(sortedString);
        return true;
    }
}
