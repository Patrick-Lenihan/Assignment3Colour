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
     *                  this class represents.
     * @param amountGreen the amount of green in the color
     *                  this class represents.
     * @param amountBlue the amount of red in the color
     *                  this class represents.
     */
    public Color(float amountRed, float amountGreen, float amountBlue) throws IllegalParamException{
        float[] params ={amountRed,amountBlue,amountGreen};
        for (int i = 0; i <= 3; i ++) {
            if (params[i] < 0.0 || 1.0 < params[i]) {
                throw new IllegalParamException("value must be between 0 and 1");
            }
        }
        this.amountRed = (int) (amountRed*255);
        this.amountGreen = (int) (amountGreen*255);
        this.amountBlue = (int) (amountBlue*255);
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
