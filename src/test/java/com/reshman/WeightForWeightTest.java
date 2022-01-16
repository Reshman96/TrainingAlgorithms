package com.reshman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeightForWeightTest {

    @Test
    @DisplayName("orderWeight Test")
    void orderWeightTest() {
        Assertions.assertEquals("1000 1321 430 324 534 654 765" ,
                WeightForWeight.orderWeight("1000 534 324 765 654 430 1321"));
    }
}
