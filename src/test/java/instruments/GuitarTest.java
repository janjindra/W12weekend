package instruments;

import org.junit.Test;
import shop.instruments.Drum;
import shop.instruments.Guitar;
import shop.instruments.Instrument;
import shop.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    @Test
    public void canGetGuitarDetails(){
        Guitar guitar = new Guitar("guitar", 120, 133,"wood","brown", InstrumentType.STRING,5);
        assertEquals("guitar", guitar.getProductName());
        assertEquals(120, guitar.getPurchasePrice(),0);
        assertEquals(133, guitar.getSellingPrice(),0);
        assertEquals("wood", guitar.getMaterial());
        assertEquals("brown", guitar.getColor());
        assertEquals(InstrumentType.STRING, guitar.getType());
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        Guitar guitar = new Guitar("guitar", 120, 133,"wood","brown",InstrumentType.STRING,5);
        assertEquals("zzzZZZzzz", guitar.play());
    }

    @Test
    public void calculateMarkup(){
        Guitar guitar = new Guitar("guitar", 120, 133,"wood","brown",InstrumentType.STRING,5);
        assertEquals(13,guitar.markUp(),0);
    }
}
