import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class testColor {
    @Test
    void testColorInit(){
        Color rgbColorInstance = new Color((float)1.0,(float)0.12549019607,(float) 0.1294117647);
        assertEquals(255,rgbColorInstance.getRed(),"red colors do not match");
        assertEquals(32,rgbColorInstance.getGreen(),"green colors do not match");
        assertEquals(33,rgbColorInstance.getBlue(),"blue colors do not match");
        rgbColorInstance = new Color((float)0.21568627451,(float)0.12549019607,(float) 0.1294117647);
        assertEquals(55,rgbColorInstance.getRed(),"red colors do not match: ");
    }

}
