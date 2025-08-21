package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addsNumbers() {
        Calculator c = new Calculator();
        assertEquals(7, c.add(3, 4));
    }

    @Test
    void dividesNumbers() {
        Calculator c = new Calculator();
        assertEquals(5, c.divide(10, 2));
    }

    @Test
    void divideByZeroThrows() {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> c.divide(1, 0));
    }
}
