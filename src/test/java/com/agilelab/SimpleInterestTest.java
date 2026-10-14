
package com.agilelab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleInterestTest {

    @Test
    void testSimpleInterest() {
        assertEquals(
                1000.0,
                SimpleInterest.calculate(10000, 5, 2),
                0.001
        );
    }

    @Test
    void testZeroPrincipal() {
        assertEquals(
                0.0,
                SimpleInterest.calculate(0, 5, 2),
                0.001
        );
    }

    @Test
    void testNegativePrincipal() {
        assertThrows(
                IllegalArgumentException.class,
                () -> SimpleInterest.calculate(-1000, 5, 2)
        );
    }
}
