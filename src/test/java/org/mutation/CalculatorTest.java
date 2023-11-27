package org.mutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.add(1,1), 2, 0.01);
    }

    @Test
    public void subTest() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.sub(5,3),2);
    }

    @Test
    public void shiftTest() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.shiftleft(5,1),10);
    }

    @Test
    public void logicTest() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.logicaland(5),1);
    }
}
