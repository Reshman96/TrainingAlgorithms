package com.reshman;

public class LastSurvivorsEp2 {

    public static void main(String[] args) {
        System.out.println(lastSurvivors("aazzbpbcfcdsad"));
    }

    public static String lastSurvivors(String str) {
        while(true) {
            if (str.equals(checkString(str))) {
                return str;
            }
            str = checkString(str);
        }
    }

    public static String checkString(String str) {
        str = str.trim();
        StringBuilder sb = new StringBuilder(str);

        // looping through given string for length times
        for (int i = 0; i < sb.length(); i++) {
            boolean match = false;

            // for each letter within the given string
            if ((i + 1) < sb.length()) {
                for (int j = i + 1; j < sb.length(); j++) {

                    // comparing letter with every loop
                    if (sb.charAt(i) == sb.charAt(j)) {
                        match = true;

                        // checking if there is two matching letters
                        if (match) {
                            char nextChar = (sb.charAt(i) == 'z') ? 'a' : (char) (sb.charAt(i) + 1);

                            // removing both the first and second letters from sb
                            sb = sb.deleteCharAt(i);
                            sb = sb.deleteCharAt(j-1);

                            // inserting next character in sequence into sb
                            sb = sb.insert(i, nextChar);
                            return sb.toString();
                        }
                    }
                }
            }
        }
        return sb.toString();
    }
}
