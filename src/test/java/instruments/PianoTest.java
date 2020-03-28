package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.instruments.Guitar;
import shop.instruments.InstrumentType;
import shop.instruments.Piano;
import static org.junit.Assert.assertEquals;

public class PianoTest {

    @Test
    public void canGetPianoDetails(){
        Piano piano = new Piano("piano", 100, 140,"wood","black",InstrumentType.STRING);
        assertEquals("piano", piano.getProductName());
        assertEquals(100, piano.getPurchasePrice(),0);
        assertEquals(140, piano.getSellingPrice(),0);
        assertEquals("wood", piano.getMaterial());
        assertEquals("black", piano.getColor());
        assertEquals(InstrumentType.STRING, piano.getType());
    }

    @Test
    public void canPlay(){
        Piano piano = new Piano("piano", 100, 140,"wood","black", InstrumentType.STRING);
        assertEquals("Ta-da-da Ta-da-da", piano.play());
    }
    @Test
    public void calculateMarkup(){
        Piano piano = new Piano("piano", 100, 140,"wood","black",InstrumentType.STRING);
        assertEquals(40,piano.markUp(),0);
    }


}
