package leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {

//    Design an algorithm to encode a list of strings to a string.
//    The encoded string is then sent over the network and is decoded
//    back to the original list of strings.
    public static void main(String[] args) {

        List<String> input = new ArrayList<>(Arrays.asList("lint","code","love","you"));
        System.out.println(input);
        encode(input);
        decode(encode(input));
    }

    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public static String encode(List<String> strs) {
        // write your code here
        String endcodedString = String.join(";..;',;m.,;.m;", strs);
        System.out.println(endcodedString);
        return endcodedString;
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public static List<String> decode(String str) {
        List<String> decodedArray = List.of(str.split(";..;',;m.,;.m;"));
        System.out.println(decodedArray);
        return decodedArray;
    }
}
