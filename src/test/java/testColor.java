import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class testColor {
    @Test
    void testColorInit(){
        try {
            Color rgbColorInstance = new Color((float) 1.0, (float) 0.12549019607, (float) 0.1294117647);
            assertEquals(255,rgbColorInstance.getRed(),"red colors do not match");
            assertEquals(32,rgbColorInstance.getGreen(),"green colors do not match");
            assertEquals(33,rgbColorInstance.getBlue(),"blue colors do not match");

            rgbColorInstance = new Color((float)0.21568627451,(float)0.12549019607,(float) 0.1294117647);
            assertEquals(55,rgbColorInstance.getRed(),"red colors do not match: ");
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }



    }
    @ParameterizedTest
    @ValueSource(floats={(float) 1.1,(float) -0.1})
    void testConstructorShouldNotAcceptOutOfRangeValues(float outOfRangeVal){

        Exception checkRedOutOfRange = assertThrows(IllegalArgumentException.class, () ->
                new Color(outOfRangeVal,(float)0.12549019607,(float) 0.1294117647));
        assertEquals("value must be between 0 and 1", checkRedOutOfRange.getMessage());

        Exception checkGreenOutOfRange = assertThrows(IllegalArgumentException.class, () ->
                new Color((float)1.0,outOfRangeVal,(float) 0.1294117647));
        assertEquals("value must be between 0 and 1", checkGreenOutOfRange.getMessage());

        Exception checkBlueOutOfRange = assertThrows(IllegalArgumentException.class, () ->
                new Color((float)1.0,(float)0.12549019607,outOfRangeVal));
        assertEquals("value must be between 0 and 1", checkBlueOutOfRange.getMessage());
    }
    @Test
    void testConstructorCanTakeInOneValue(){
        try {
            Color rgbColorInstance = new Color(0B111111110011001000000001);

            assertEquals(255, rgbColorInstance.getBlue(), "blue colors do not match");
            assertEquals(50, rgbColorInstance.getGreen(), "green colors do not match");
            assertEquals(1, rgbColorInstance.getRed(), "red colors do not match");
            rgbColorInstance = new Color(0B100000000000000000000000);
            assertEquals(128, rgbColorInstance.getBlue(), "blue colors do not match");



        }catch (IllegalArgumentException e){
            throw new RuntimeException(e);
        }

    }
    @Test
    void testConstructorThrowsException(){
        Exception checkInputTooLong = assertThrows(IllegalArgumentException.class, () ->
                new Color(0B1000000000000000000000000));
        assertEquals("binary value not the correct length", checkInputTooLong.getMessage());
    }

    @Test
    void testIsColorEquals(){
        Color rgbColorInstance = new Color((float) 1.0, (float) 0.12549019607, (float) 0.1294117647);
        String message = "colors that are the same do not show up as equal";
        assertEquals(new Color((float) 1.0, (float) 0.12549019607, (float) 0.1294117647),rgbColorInstance,message);


    }
}
