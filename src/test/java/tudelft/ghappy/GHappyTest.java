package tudelft.ghappy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GHappyTest {

    private final GHappy gHappy = new GHappy();

    @Test
    void testAllGsAreHappy() {
        assertTrue(gHappy.gHappy("xxggxx"));  // Caso donde todas las 'g' están felices
    }

    @Test
    void testSingleUnhappyG() {
        assertFalse(gHappy.gHappy("xxgxx"));  // Caso donde hay una 'g' solitaria
    }

    @Test
    void testMixedHappyAndUnhappyGs() {
        assertFalse(gHappy.gHappy("xxggyygxx"));  // Caso donde hay una 'g' infeliz al final
    }

    @Test
    void testNoGs() {
        assertTrue(gHappy.gHappy("xxxxx"));  // Caso donde no hay 'g', debe ser verdadero
    }

    @Test
    void testOnlyGs() {
        assertTrue(gHappy.gHappy("gggggg"));  // Caso donde todas las 'g' están emparejadas
    }

    @Test
    void testOneSingleG() {
        assertFalse(gHappy.gHappy("g"));  // Caso con una sola 'g', debe ser falso
    }

    @Test
    void testGsSeparated() {
        assertFalse(gHappy.gHappy("gxxgxxg"));  // Caso donde las 'g' están separadas
    }

    @Test
    void testGsAtEdges() {
        assertTrue(gHappy.gHappy("ggxxgg"));  // Caso donde las 'g' en los bordes están felices
    }
}
