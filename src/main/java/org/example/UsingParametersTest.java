package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class UsingParametersTest {
    Number number;

    @BeforeEach
    void setUp() {
        number = new Number();
    }

    @Test
    @DisplayName("Проверка значений в диапазоне 0-10")
    void Test53() {
        assertEquals(53, Number.result (5));
    }
    @Test
    @DisplayName("Проверка значений в диапазоне 25-78")
    void Test41() {
        assertEquals(41, Number.result (30));
    }
    @Test
    @DisplayName("Проверка значений в диапазоне 125+")
    void Test112() {
        assertEquals(112, Number.result (130));
    }
    @Test
    @DisplayName("Проверка значений в остальных диапазонах")
    void Test1() {
        assertEquals(-1, Number.result (20));
    }
}
