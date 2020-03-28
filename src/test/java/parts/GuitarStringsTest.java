package parts;

import org.junit.Test;
import shop.parts.DrumSticks;
import shop.parts.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    @Test
    public void canGetGuitarStringsDetails(){
        GuitarStrings guitarStrings = new GuitarStrings("guitar strings", 40, 43);
        assertEquals("guitar strings", guitarStrings.getProductName());
        assertEquals(40, guitarStrings.getPurchasePrice(),0);
        assertEquals(43, guitarStrings.getSellingPrice(),0);
    }

    @Test
    public void calculateMarkup(){
        GuitarStrings guitarStrings = new GuitarStrings("guitar strings", 40, 43);
        assertEquals(3,guitarStrings.markUp(),0);
    }

}
