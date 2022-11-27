public class Color {
    private int amountRed;

    public Color(float amountRed, float amountGreen, float amountBlue){
        this.amountRed = (int) amountRed*255;
    }
    public int getRed(){
        return amountRed;
    }
}
