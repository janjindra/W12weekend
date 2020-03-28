package parts;

import org.junit.Test;
import shop.parts.GuitarStrings;
import shop.parts.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    @Test
    public void canGetSheetMusicDetails(){
        SheetMusic sheetMusic = new SheetMusic("sheet music", 20, 25, "rock");
        assertEquals("sheet music", sheetMusic.getProductName());
        assertEquals(20, sheetMusic.getPurchasePrice(),0);
        assertEquals(25, sheetMusic.getSellingPrice(),0);
    }

    @Test
    public void calculateMarkup(){
        SheetMusic sheetMusic = new SheetMusic("sheet music", 20, 25, "rock");
        assertEquals(5,sheetMusic.markUp(),0);
    }

}
