package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldDividePositives() {

        assertEquals(3, calc.divide(6,2));
        assertEquals(2, calc.divide(80, 39));
        assertEquals(1, calc.divide(105, 100));
    }

    @Test
    public void shouldDivideNegatives() {

        assertEquals(3, calc.divide(-6,-2));
        assertEquals(2, calc.divide(-80, -39));
        assertEquals(1, calc.divide(-105, -100));
    }

    @Test
    public void shouldDivideBothPosAndNeg() {
        assertEquals(-3, calc.divide(6,-2));
        assertEquals(-2, calc.divide(-80, 39));
        assertEquals(-1, calc.divide(105, -100));
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, calc.divide(0,0));
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(105, 0));
    }

    @Test
    public void sumArrayShouldSum(){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5};
        int[] arr3 = {0, 24, -3, 50, 104, -35};

        assertEquals(15, calc.sumArrays(arr1, arr2));
        assertEquals(145, calc.sumArrays(arr2, arr3));
        assertEquals(150, calc.sumArrays(arr1, arr3));
    }

    @Test
    public void shouldArrayify(){
        int[] a1 = {5,6,7};
        assertArrayEquals(a1, calc.arrayify(3,5));
    }
}
