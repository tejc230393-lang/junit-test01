package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void addのテスト() {
        Calc calc = new Calc();
        assertEquals(4, calc.add(1, 3));
    }

    @Test
    public void subのテスト() {
        Calc calc = new Calc();
        assertEquals(7, calc.sub(10, 3));
    }

    @Test
    public void divのテスト() {
        Calc calc = new Calc();
        assertEquals(5, calc.div(10, 2));
    }

    @Test
    public void mulのテスト() {
        Calc calc = new Calc();
        assertEquals(30, calc.mul(10, 3));
    }

    @Test
    public void ゼロで割ったときのテスト() {
        Calc calc = new Calc();

        ArithmeticException error = assertThrows(
                ArithmeticException.class,
                () -> calc.div(10, 0));

        assertTrue(error.getMessage().contains("by zero"));
    }
}