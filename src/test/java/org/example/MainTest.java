package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testIsDivisibleBy13() {
        // Лямбда-выражение для проверки делимости на 13
        NumberChecker isDivisibleBy13 = number -> number % 13 == 0;

        // Тестовые проверки
        assertTrue(isDivisibleBy13.check(26), "26 должно делиться на 13");
        assertFalse(isDivisibleBy13.check(15), "15 не должно делиться на 13");
        assertTrue(isDivisibleBy13.check(0), "0 делится на 13");
        assertFalse(isDivisibleBy13.check(-12), "-12 не делится на 13");
        assertTrue(isDivisibleBy13.check(-13), "-13 делится на 13");
    }
}
