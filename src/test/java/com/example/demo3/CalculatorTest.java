package com.example.demo3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sum() {
        assertEquals(0, calculator.sum(1));
    }

    @Test
    void sumarr() {
        assertEquals(0, calculator.sumarr(new int[]{}));
    }
}