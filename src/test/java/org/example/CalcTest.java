package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    public void testAddition() {
        assertEquals(4, c.add(2, 2));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, c.subtract(4, 2));
    }


}
