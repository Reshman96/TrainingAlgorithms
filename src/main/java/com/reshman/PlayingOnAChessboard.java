package com.reshman;

public class PlayingOnAChessboard {
    public static void main(String[] args) {
        System.out.println(game(8));
    }

    public static String game(long n) {
        long result = n * n;

        if ((((double) n * (double) n) / 2) % 1 == 0) {
            result = result / 2;
            return "[" + Long.toString(result) + "]";
        } else {
            return "[" + Long.toString(result) + ", 2]";
        }
    }
}
