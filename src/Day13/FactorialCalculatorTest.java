package Day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    public void testFactorialOfSmallNumber() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }
}