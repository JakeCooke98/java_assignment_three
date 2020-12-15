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
        if(r>255 || r<0) {
            throw new IllegalArgumentException("R must be in the range 0 - 255");
        }
        else {
            this.r = r;
        }
        if(g>255 || g<0){
            throw new IllegalArgumentException("G must be in the range 0 - 255");
        }
        else {
            this.g = g;
        }
        if(b>255 || b<0){
            throw new IllegalArgumentException("B must be in the range 0 - 255");
        }
        else {
            this.b = b;
        }
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
}

