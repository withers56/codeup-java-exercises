package leetcodes;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidPalindrome {
//    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
//    non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

//    Runtime: 10 ms, faster than 46.61% of Java online submissions for Valid Palindrome.
//    Memory Usage: 44.4 MB, less than 39.26% of Java online submissions for Valid Palindrome.
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();
        String strNormal = "";
        String strReverse = "";

        //remove all special characters
        for (int i = 0; i < s.length(); i++) {
            char currentLetter = Character.toLowerCase(s.charAt(i));
//            System.out.println(currentLetter);

            if ((int) currentLetter <= 122 && (int) currentLetter >= 97) {
                str.append(currentLetter);
            }
            if ((int) currentLetter <= 57 && (int) currentLetter >= 48) {
                str.append(currentLetter);
            }
        }
        strNormal = String.valueOf(str);
        strReverse = String.valueOf(str.reverse());

        return strNormal.equals(strReverse);
    }
}
