import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    @Test
    void getName() {
        Colour colour = new Colour("Blue");
        assertEquals(colour.getName(), "Blue");
    }
}