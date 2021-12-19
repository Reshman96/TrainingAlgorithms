package com.reshman;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        return decodeIP(end) - decodeIP(start);
    }

    private static long decodeIP(String address) {
        int counter = 0;

        Long[] nums = new Long[4];
        for (String section : address.split("\\.")) {
            nums[counter] = Long.valueOf(section);
            counter++;
        }
        long result = 0;
        for (int i = 0; i < 4; i++) {
            result += (nums[i] * Math.pow(256, 3 - i));
        }
        return result;
    }
}