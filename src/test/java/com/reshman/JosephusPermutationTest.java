package com.reshman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static com.reshman.JosephusPermutation.josephusPermutation;

public class JosephusPermutationTest {


    @Test
    void josephusPermutationTest() {
        Assertions.assertEquals(Arrays.asList(3, 6, 9, 2, 7, 1, 8, 5, 10, 4), josephusPermutation(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), 3));
    }
}
