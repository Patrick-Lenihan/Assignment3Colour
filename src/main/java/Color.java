/**
 * @author patrick-lenihan
 *
 * this is a class that represents color in rgb format
 *
 */
public class Color {
    /**
     * the amount of red in the color this
     * class represents
     */
    private int amountRed;
    /**
     * the amount of green in the color this
     * class represents
     */
    private int amountGreen;

    /**
     * the amount of blue in the color this
     * class represents.
     */
    private int amountBlue;

    /**
     * this is a contructor for Color
     * @param amountRed the amount of red in the color
     *                  this class represents. Must be in
     *                  range between 0.0 to 0.1.
     * @param amountGreen the amount of green in the color
     *                  this class represents.Must be in
     *                  range between 0.0 to 0.1.
     * @param amountBlue the amount of red in the color
     *                  this class represents.Must be in
     *                  range between 0.0 to 0.1.
     * @throws IllegalArgumentException when the arguments are not
     * in the correct range of 0.0 to 0.1
     */
    public Color(float amountRed, float amountGreen, float amountBlue) throws IllegalArgumentException{
        float[] params ={amountRed,amountBlue,amountGreen};
        for (int i = 0; i <= 3; i ++) {
            if (params[i] < 0.0 || 1.0 < params[i]) {
                throw new IllegalArgumentException("value must be between 0 and 1");
            }
        }
        this.amountRed = (int) (amountRed*255);
        this.amountGreen = (int) (amountGreen*255);
        this.amountBlue = (int) (amountBlue*255);
    }

    /**
     * the constructor for Color
     * @param rgbBinary A binary int with
     *                  red component in bits 16-23,
     *                  the green component in bits 8-15,
     *                  and the blue component in bits 0-7
     */
    public Color(int rgbBinary){
        this.amountBlue = getColorFromBin(rgbBinary, 16,0B111111110000000000000000);
        this.amountGreen = getColorFromBin(rgbBinary,8,0B000000001111111100000000);
        this.amountRed = getColorFromBin(rgbBinary,0,0B000000000000000011111111);
    }

    private int getColorFromBin(int rgbBinary, int shift,int mask){
        rgbBinary = rgbBinary & mask;
        rgbBinary = rgbBinary >> shift;
        return rgbBinary;
    }
    /**
     * the getter for amountRed
     *
     * @return the amount of red
     *          in the color
     *          this class represents
     */
    public int getRed(){
        return amountRed;
    }

    /**
     * the getter for amountGreen
     *
     * @return the amount of green
     * in the color this class represents
     */
    public int getGreen(){
        return amountGreen;
    }

    /**
     * the getter for amountBlue
     *
     * @return the amount of Blue
     * in the color this class represents
     */
    public int getBlue(){
        return amountBlue;
    }
}
