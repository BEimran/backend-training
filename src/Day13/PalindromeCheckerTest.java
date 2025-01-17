package Day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {
    public void testValidPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("madam"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
    }
}