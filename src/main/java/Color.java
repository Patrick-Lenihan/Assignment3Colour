public class Color {
    private int amountRed;
    private int amountGreen;

    public Color(float amountRed, float amountGreen, float amountBlue){
        this.amountRed = (int) amountRed*255;
        this.amountGreen = (int) (amountGreen*255);
        System.out.println(this.amountGreen);
    }
    public int getRed(){
        return amountRed;
    }
    public int getGreen(){
        return amountGreen;
    }
}
