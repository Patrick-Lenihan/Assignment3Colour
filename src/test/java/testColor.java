import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import Color;
public class testColor {
    @Test
    void testColorInit(){
        rgbColorInstance = Color(1.0,0.1294117647,0.1294117647);
        assertEquals(rgbColorInstance.getRed(),255,"red colors do not match");
    }

}
