package tudelft.chocolate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ChocolateDistributionTest {

    public String distributeChocolate(int bars, int people) {
        if (bars <= 0 || people <= 0) {
            return "Error de entrada";
        }
        if (bars % people == 0) {
            return "Repartición exacta, " + (bars / people) + " por persona";
        }
        return "No se puede dividir exactamente";
    }

    @Test
    void testExactDistribution() {
        assertEquals("Repartición exacta, 2 por persona", distributeChocolate(10, 5));
    }

    @Test
    void testNonExactDistribution() {
        assertEquals("No se puede dividir exactamente", distributeChocolate(10, 3));
    }

    @Test
    void testSinglePerson() {
        assertEquals("Repartición exacta, 1 por persona", distributeChocolate(1, 1));
    }

    @Test
    void testZeroBars() {
        assertEquals("Error de entrada", distributeChocolate(0, 2));
    }

    @Test
    void testNegativeBars() {
        assertEquals("Error de entrada", distributeChocolate(-5, 3));
    }

    @Test
    void testNegativePeople() {
        assertEquals("Error de entrada", distributeChocolate(8, -2));
    }
}