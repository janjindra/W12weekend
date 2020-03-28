package instruments;

import org.junit.Test;
import shop.instruments.Drum;
import shop.instruments.InstrumentType;
import shop.instruments.Piano;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DrumTest {
    @Test
    public void canGetDrumDetails(){
        Drum drum = new Drum("drum", 200, 210,"plastic","red", InstrumentType.PERCUSSION,2);
        assertEquals("drum", drum.getProductName());
        assertEquals(200, drum.getPurchasePrice(),0);
        assertEquals(210, drum.getSellingPrice(),0);
        assertEquals("plastic", drum.getMaterial());
        assertEquals("red", drum.getColor());
        assertEquals(InstrumentType.PERCUSSION, drum.getType());
        assertEquals(2, drum.getNumberOfSticks());
    }

    @Test
    public void canPlay(){
        Drum drum = new Drum("drum", 200, 210,"plastic","red",InstrumentType.PERCUSSION,2);
        assertEquals("Boom Booom Boom", drum.play());
    }

    @Test
    public void calculateMarkup(){
        Drum drum = new Drum("drum", 200, 210,"plastic","red",InstrumentType.PERCUSSION,2);
        assertEquals(10,drum.markUp(),0);
    }
}
