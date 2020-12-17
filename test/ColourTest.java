import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ColourTest {
    private final int max = 255;
    private final int min = 0;
    Colour green = new Colour(0, 255, 0, "RGB");
    Colour blue = new Colour(0, 0, 255, "RGB");
    Colour red = new Colour(255,0, 0, "RGB");
    Colour pink = new Colour("Pink", "NAME");
    Colour black = new Colour("Black", "NAME");
    Colour redTwo = new Colour(255,0,0,"RGB");
    Colour pinkTwo = new Colour("pink", "NAME");
    Colour randomOne = new Colour(32,0,0,"RGB");
    Colour randomTwo = new Colour(32,0,32,"RGB");


    @Test
    void getBlueRGB() {
        assertEquals(0,blue.getR());
        assertEquals(255,blue.getB());
        assertEquals(0,blue.getG());
        assertEquals("RGB",blue.getModelType());
        assertTrue(blue.getR() >= min && blue.getR() <= max);
        assertTrue(blue.getG() >= min && blue.getG() <= max);
        assertTrue(blue.getB() >= min && blue.getB() <= max);
    }

    @Test
    void getGreenRGB() {
        assertEquals(0,green.getR());
        assertEquals(255,green.getG());
        assertEquals(0,green.getB());
        assertEquals("RGB",green.getModelType());
        assertTrue(green.getR() >= min && green.getR() <= max);
        assertTrue(green.getG() >= min && green.getG() <= max);
        assertTrue(green.getB() >= min && green.getB() <= max);
    }

    @Test
    void getRedRGB() {
        assertEquals(255,red.getR());
        assertEquals(0,red.getG());
        assertEquals(0,red.getB());
        assertEquals("RGB",red.getModelType());
        assertTrue(green.getR() >= min && green.getR() <= max);
        assertTrue(green.getG() >= min && green.getG() <= max);
        assertTrue(green.getB() >= min && green.getB() <= max);
    }


    @Test
    void getPinkNAME() {
        assertEquals("NAME", pink.getModelType());
        assertEquals("pink", pink.getColour());
    }

    @Test
    void compareTwoRGBObjects() {
        assertEquals(red.getR(), redTwo.getR());
        assertEquals(red.getG(), redTwo.getG());
        assertEquals(red.getB(), redTwo.getB());
        assertEquals(red.getModelType(), redTwo.getModelType());
        assertTrue(redTwo.getR() >= min && redTwo.getR() <= max);
        assertTrue(redTwo.getG() >= min && redTwo.getG() <= max);
        assertTrue(redTwo.getB() >= min && redTwo.getB() <= max);
        assertTrue(red.getR() >= min && red.getR() <= max);
        assertTrue(red.getG() >= min && red.getG() <= max);
        assertTrue(red.getB() >= min && red.getB() <= max);
    }

    @Test
    void compareTwoNAMEObjects() {
        assertEquals(pink.getModelType(), pinkTwo.getModelType());
        assertEquals(pink.getColour(), pinkTwo.getColour());
    }

    @Test
    void compareTwoDifferentRGBObjects() {
        assertThrows(AssertionFailedError.class, ()->{
            assertEquals(red.getModelType(),blue.getModelType());
            assertEquals(red.getR(), blue.getR());
            assertEquals(red.getG(), blue.getG());
            assertEquals(red.getB(), blue.getB());
            assertTrue(blue.getR() >= min && blue.getR() <= max);
            assertTrue(blue.getG() >= min && blue.getG() <= max);
            assertTrue(blue.getB() >= min && blue.getB() <= max);
            assertTrue(red.getR() >= min && red.getR() <= max);
            assertTrue(red.getG() >= min && red.getG() <= max);
            assertTrue(red.getB() >= min && red.getB() <= max);
                });
    }

    @Test
    void compareTwoDifferentNAMEObject() {
        assertThrows(AssertionFailedError.class, () -> {
            assertEquals(pink.getModelType(), black.getModelType());
            assertEquals(pink.getColour(), black.getColour());
        });
    }

    @Test
    void compareTwoDifferentModels() {
        assertThrows(AssertionFailedError.class, () -> assertEquals(pink.getModelType(), blue.getModelType()));
    }

    @Test
    void addColours() {
        assertEquals(randomOne.add(randomTwo),randomOne.add(randomTwo));
        assertEquals(pink.add(pinkTwo), pink.add(pink));
    }

    @Test
    void addTwoColoursThatExceed() {
        assertThrows(IllegalArgumentException.class,() -> assertEquals(blue.add(blue),blue.add(blue)));
    }
}
