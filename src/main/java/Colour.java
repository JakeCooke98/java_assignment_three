public class Colour {

    private String colourName;
    private String modelType;

    private int r;
    private int g;
    private int b;

    /**
     * @param modelType - Tagged field to identify RGB or NAME
     * @param colourName - This field only used if modelType is NAME
     * These fields only used if modelType is RGB
     * @param r - Used to specify the RED part of RGB
     * @param g - Used to specify the GREEN part of RGB
     * @param b - Used to specify the BLUE part of RGB
     */

    public Colour(int r, int g, int b, String modelType) {
        if (r <= 255 && r >= 0) { this.r = r;}
        else { throw new IllegalArgumentException("R must be in the range 0 - 255");}
        if (g <= 255 && g >= 0) { this.g = g;}
        else { throw new IllegalArgumentException("G must be in the range 0 - 255");}
        if (b <= 255 && b >= 0) { this.b = b;}
        else { throw new IllegalArgumentException("B must be in the range 0 - 255");}
        this.modelType = modelType;
    }

    public Colour(String colourName, String modelType) {
        this.colourName = colourName;
        this.modelType = modelType;
    }

    public String getModelType() {
        return this.modelType;
    }

    public String getColour() {
        return this.colourName;
    }

    public int getR() {
        return this.r;
    }

    public int getG() {
        return this.g;
    }

    public int getB() {
        return this.b;
    }
}