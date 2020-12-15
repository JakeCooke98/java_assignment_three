import com.sun.org.apache.xpath.internal.objects.XObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    private final int max = 255;
    private final int min = 0;
    Colour green = new Colour(0, 255, 0, "RGB");
    Colour blue = new Colour(0, 0, 255, "RGB");
    Colour red = new Colour(255,0, 0, "RGB");
    Colour pink = new Colour("Pink", "NAME");


    @Test
    void getBlue() {
        assertEquals(0,blue.getR());
        assertEquals(255,blue.getB());
        assertEquals(0,blue.getG());
        assertTrue(blue.getR() >= min && blue.getR() <= max);
        assertTrue(blue.getG() >= min && blue.getG() <= max);
        assertTrue(blue.getB() >= min && blue.getB() <= max);
    }

    @Test
    void getGreen() {
        assertEquals(0,green.getR());
        assertEquals(255,green.getG());
        assertEquals(0,green.getB());
        assertTrue(green.getR() >= min && green.getR() <= max);
        assertTrue(green.getG() >= min && green.getG() <= max);
        assertTrue(green.getB() >= min && green.getB() <= max);
    }

    @Test
    void getRed() {
        assertEquals(255,red.getR());
        assertEquals(0,red.getG());
        assertEquals(0,red.getB());
        assertTrue(green.getR() >= min && green.getR() <= max);
        assertTrue(green.getG() >= min && green.getG() <= max);
        assertTrue(green.getB() >= min && green.getB() <= max);
    }

    @Test
    void compareObjectsByString() {
        assertEquals("NAME", pink.getModelType());
        assertEquals("Pink", pink.getColour());
    }

    @Test
    void compareObjectsByRGB() {
        assertEquals(green.getR(),blue.getR());
        assertEquals(green.getB(),blue.getB());
        assertEquals(green.getG(), blue.getG());
        assertEquals(green.getModelType(), blue.getModelType());
    }
}
