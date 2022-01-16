package com.reshman;

import java.util.ArrayList;

public class WeightForWeight {

    public static String orderWeight(String string) {
        ArrayList<String> stringArray = new ArrayList<>();

        // Splitting up the string of digits into individual numbers and adding them to an ArrayList
        for (String str : string.split(" ")) {
            stringArray.add(str.trim());
        }

        // Sorting the array as defined in the challenge
        stringArray.sort((String str1, String str2) -> {
            if (toNum(str1) > toNum(str2)) {
                return 1;
            } else if (toNum(str1) < toNum(str2)) {
                return -1;
            } else {
                return str1.compareTo(str2);
            }
        });

        // Combining the ArrayList into a String of numbers
        StringBuilder result = new StringBuilder();
        for (String num : stringArray) {
            result.append(" ").append(num);
        }
        return result.toString().trim();
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
