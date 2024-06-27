package ru.honest.niceman.case4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(5));
        assertEquals(10, calculator.add(5));
    }

    @Test
    public void testSubtract() {
        assertEquals(-5, calculator.subtract(5));
        assertEquals(-10, calculator.subtract(5));
    }

    @Test
    public void testMultiply() {
        calculator.add(2); // Set initial value to 2
        assertEquals(4, calculator.multiply(2));
        assertEquals(8, calculator.multiply(2));
    }

    @Test
    public void testSequenceOfOperations() {
        assertEquals(5, calculator.add(5)); // 0 + 5 = 5
        assertEquals(0, calculator.subtract(5)); // 5 - 5 = 0
        assertEquals(0, calculator.multiply(10)); // 0 * 10 = 0

        calculator.reset(); // Reset calculator to initial state

        assertEquals(2, calculator.add(2)); // 0 + 2 = 2
        assertEquals(4, calculator.multiply(2)); // 2 * 2 = 4
        assertEquals(0, calculator.subtract(4)); // 4 - 4 = 0
    }
}