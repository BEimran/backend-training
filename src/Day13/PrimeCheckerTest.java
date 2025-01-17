package Day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    @Test
    public void testPrimeNumber() {
        assertTrue(PrimeChecker.isPrime(7));
    }

    @Test
    public void testNonPrimeNumber() {
        assertFalse(PrimeChecker.isPrime(10));
    }
}