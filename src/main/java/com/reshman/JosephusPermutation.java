package com.reshman;

import java.util.ArrayList;
import java.util.List;

public class JosephusPermutation {

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        int count = 1;
        int position = 0;
        List<T> result = new ArrayList<>();

        while (items.size() > 0) {
            for (; position < items.size(); position++) {

                if (count == k) {
                    result.add(items.get(position));
                    items.remove(position);
                    count = 1;
                    position--;
                    if (items.size() == 0) return result;

                } else count++;
            }
            position = 0;
        }
        return result;
    }
}
