import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    private final int max = 255;
    private final int min = 0;

    @Test
    void getBlue() {
        Colour blue = new Colour("Blue", 0, 0, 255);
        assertEquals(blue.getColour(), "Blue");
        assertEquals(blue.getR(),0);
        assertEquals(blue.getB(),255);
        assertEquals(blue.getG(), 0);
        assertTrue(blue.getR() >= min && blue.getR() <= max);
        assertTrue(blue.getG() >= min && blue.getG() <= max);
        assertTrue(blue.getB() >= min && blue.getB() <= max);
    }

}