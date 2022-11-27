import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class testColor {
    @Test
    void testColorInit(){
        Color rgbColorInstance = new Color((float)1.0,(float)0.12549019607,(float) 0.1294117647);
        assertEquals(rgbColorInstance.getRed(),255,"red colors do not match");
        assertEquals(rgbColorInstance.getGreen(),32,"green colors do not match");
        assertEquals(rgbColorInstance.getBlue(),33,"blue colors do not match");
    }

}
