package Day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySorterTest {

    @Test
    public void testUnsortedArray() {
        int[] input = {4, 3, 1, 2};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, ArraySorter.sortArray(input));
    }
}