package tudelft.chocolate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ChocolateBagsTest1 {

    private final ChocolateBags chocolateBags = new ChocolateBags();

    @Test
    void totalIsTooBig() {
        assertEquals(-1, chocolateBags.calculate(4, 1, 10));
    }

    @Test
    void onlyBigBars() {
        assertEquals(0, chocolateBags.calculate(4, 2, 10));
    }

    @Test
    void needsBigAndSmallBars() {
        assertEquals(3, chocolateBags.calculate(3, 2, 13));
    }

    @Test
    void onlySmallBars() {
        assertEquals(4, chocolateBags.calculate(4, 0, 4));
    }
}
