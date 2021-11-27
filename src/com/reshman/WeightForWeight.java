package com.reshman;

import java.util.ArrayList;
import java.util.Collections;

public class WeightForWeight {

    public static void main(String[] args) {
        System.out.println(orderWeight("1000 534 324 765 654 430 1321"));
    }

    public static String orderWeight(String strng) {
        ArrayList<String> stringArray = new ArrayList<>();

        // Splitting up the string of digits into individual numbers and adding them to an ArrayList
        for (String str : strng.split(" ")) {
            stringArray.add(str.trim());
        }

        // Sorting the array as defined in the challenge
        Collections.sort(stringArray, (String str1, String str2) -> {
            if (toNum(str1) > toNum(str2)) {
                return 1;
            } else if (toNum(str1) < toNum(str2)) {
                return -1;
            } else {
                return str1.compareTo(str2);
            }
        });

        // Combining the ArrayList into a String of numbers
        String result = "";
        for (String num : stringArray) {
            result += " " + num;
        }
        return result.trim();
    }

    // Calculating the "weight" of each number
    public static int toNum(String str) {
        int wordScore = 0;
        for (char digit : str.toCharArray()) {
            wordScore += Character.getNumericValue(digit);
        }
        return wordScore;
    }

}
