package Day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StringReverseTest {

    @Test
   void testNormalString() {
        assertEquals("olleh", StringReverse.rev("hello"));
    }

    @Test
   void testEmptyString() {
        assertEquals("", StringReverse.rev(""));
    }
}