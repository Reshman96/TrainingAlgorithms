package com.reshman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountIPAddressesTest {

    @Test
    public void ipsBetweenTest() {
        Assertions.assertEquals(50, CountIPAddresses.ipsBetween( "10.0.0.0", "10.0.0.50" ));
        Assertions.assertEquals(246, CountIPAddresses.ipsBetween( "20.0.0.10", "20.0.1.0" ));
    }
}
