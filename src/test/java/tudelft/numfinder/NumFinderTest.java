package tudelft.numfinder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumFinderTest {

    @Test
    void testAscendingNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{1, 2, 3, 4, 5});
        assertEquals(1, nf.getSmallest());
        assertEquals(5, nf.getLargest());
    }

    @Test
    void testDescendingNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{5, 4, 3, 2, 1});
        assertEquals(1, nf.getSmallest());
        assertEquals(5, nf.getLargest());
    }

    @Test
    void testMixedNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{3, -1, 4, -2, 0});
        assertEquals(-2, nf.getSmallest());
        assertEquals(4, nf.getLargest());
    }

    @Test
    void testSingleNumber() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{42});
        assertEquals(42, nf.getSmallest());
        assertEquals(42, nf.getLargest());
    }

    @Test
    void testAllNegativeNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{-5, -10, -3, -1, -20});
        assertEquals(-20, nf.getSmallest());
        assertEquals(-1, nf.getLargest());
    }

    @Test
    void testEmptyArray() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{});
        assertEquals(Integer.MAX_VALUE, nf.getSmallest());
        assertEquals(Integer.MIN_VALUE, nf.getLargest());
    }
}
