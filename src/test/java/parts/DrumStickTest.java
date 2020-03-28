package parts;

import org.junit.Test;
import shop.instruments.Guitar;
import shop.parts.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    @Test
    public void canGetDrumSticksDetails(){
        DrumSticks drumSticks = new DrumSticks("drum sticks", 22, 33,15);
        assertEquals("drum sticks", drumSticks.getProductName());
        assertEquals(22, drumSticks.getPurchasePrice(),0);
        assertEquals(33, drumSticks.getSellingPrice(),0);
    }

    @Test
    public void calculateMarkup(){
        DrumSticks drumSticks = new DrumSticks("drum sticks", 22, 33,15);
        assertEquals(11,drumSticks.markUp(),0);
    }

}
