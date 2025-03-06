package com.wmart.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calc;

    @BeforeEach
    void setUp(){
        calc = new CalculatorService();
    }

    @AfterEach
    void tearDown(){
        calc = null;
    }

    @Test
    void testAdd(){

        assertEquals(30, calc.add(10,20));
        assertEquals(0, calc.add(10,-10));
        assertEquals(-20, calc.add(10,-30));
    }

    @Nested
    class DivideTest {
        @Test
        void testDivide() {

            assertEquals(3, calc.divide(30, 10));
            assertEquals(5, calc.divide(30, 6));
            assertEquals(-5, calc.divide(30, -6));
        }

        @Test
        void testDivideForErrors() {

            assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
        }
    }


}