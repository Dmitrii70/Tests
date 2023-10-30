package org.example.UnitTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
Calculator calculator = new Calculator();
//Преднамеренная ошибка
    @Test
    void getSum() {
        assertEquals(7,1+7);
    }

    @Test
    void getDivide() {
        assertEquals(1, 3/3);
    }

    @Test
    void getMultiple() {
    }
}