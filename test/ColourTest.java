import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    @Test
    void getBlue() {
        Colour blue = new Colour("Blue", 0, 0, 255);
        assertEquals(blue.getColour(), "Blue");
        assertEquals(blue.getR(),0);
        assertEquals(blue.getB(),255);
        assertEquals(blue.getG(), 0);
    }

}