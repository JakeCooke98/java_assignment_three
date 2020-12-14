public class Colour {
    private final String colourName;
    private int r;
    private int g;
    private int b;

    /**
     * @param colourName = For the name of the colour, e.g "Blue" or "Red"
     * @param r = First colour of the RGB, RED
     * @param g = Second colour of the RGB, GREEN
     * @param b = Third colour of the RGB, BLUE
     */

    public Colour(String colourName, int r, int g, int b) {
        this.colourName = colourName;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getColour(){
        return colourName;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public void setR(int r) {
        if ((r <= 255) || (r >= 0)) {
            this.r = r;
        }
        else{
            System.out.println("Error - Outside of range");
        }
    }

    public void setG(int g) {
        if ((g <= 255) || (g >= 0)) {
            this.g = g;
        }
         else{
            System.out.println("Error - Outside of range");
        }
    }

    public void setB(int b) {
        if ((b <= 255) || (b >= 0)) {
            this.b = b;
        }
        else{
            System.out.println("Error - Outside of range");
        }
    }
}

