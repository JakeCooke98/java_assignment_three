public class Colour {

    private String colourName;
    private String modelType;

    private int r;
    private int g;
    private int b;

    private int totalR;
    private int totalG;
    private int totalB;

    /**
     * @param colourName - This field only used if modelType is NAME
     *                These fields only used if modelType is RGB
     * @param r          - Used to specify the RED part of RGB
     * @param g          - Used to specify the GREEN part of RGB
     * @param b          - Used to specify the BLUE part of RGB
     * @param modelType  - Tagged field to identify RGB or NAME
     */

    public Colour(int r, int g, int b, String modelType) {
        if (r <= 255 && r >= 0) {
            this.r = r;
        } else {
            throw new IllegalArgumentException("R must be in the range 0 - 255");
        }
        if (g <= 255 && g >= 0) {
            this.g = g;
        } else {
            throw new IllegalArgumentException("G must be in the range 0 - 255");
        }
        if (b <= 255 && b >= 0) {
            this.b = b;
        } else {
            throw new IllegalArgumentException("B must be in the range 0 - 255");
        }
        this.modelType = modelType;
    }

    public Colour(String colourName, String modelType) {
        this.colourName = colourName.toLowerCase();
        this.modelType = modelType;
    }

    public String getModelType() {
        return this.modelType;
    }

    public String getColour() {
        return this.colourName;
    }

    public int getR() { return this.r; }

    public int getG() {
        return this.g;
    }

    public int getB() {
        return this.b;
    }

    public Colour add(Colour c){
        totalR = this.r + c.r;
        totalG = this.g + c.g;
        totalB = this.b + c.b;
        return new Colour(totalR, totalG, totalB, "RGB");
    }

    // Overriding equals() to compare two Colour objects
    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) { return true;}
        /* Check if o is an instance of Colour or not "null instanceof [type]" also returns false */
        if (!(o instanceof Colour)) { return false;}

        // typecast o to Colour so that we can compare data members
        Colour c = (Colour) o;

        // Compare the data members and return accordingly
        return Double.compare(r, c.r) == 0 && Double.compare(g, c.g) == 0 && Double.compare(b, c.b) == 0;
    }
}
