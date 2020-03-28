package shop;

import org.junit.Before;
import org.junit.Test;
import shop.instruments.Drum;
import shop.instruments.Guitar;
import shop.instruments.InstrumentType;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Shop shop;
    Drum drum;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop("Music Shop");
        drum = new Drum("drum", 200, 210,"plastic","red", InstrumentType.PERCUSSION,2);
        guitar = new Guitar("guitar", 120, 133,"wood","brown",InstrumentType.STRING,5);

    }

    @Test
    public void hasName(){
        assertEquals("Music Shop", shop.getName());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(drum);
        shop.addToStock(guitar);
        assertEquals(2,shop.getStock().size());
        assertEquals(13, shop.getStock().get(1).markUp(),0);
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(drum);
        shop.addToStock(guitar);
        shop.removeFromStock(guitar);
        assertEquals(1,shop.getStock().size());
        assertEquals(10, shop.getStock().get(0).markUp(),0);
    }

    @Test
    public void canCalculateTotalProfitPerShop(){
        shop.addToStock(drum);
        shop.addToStock(guitar);
        shop.addToStock(drum);
        shop.addToStock(guitar);
        shop.addToStock(drum);
        shop.addToStock(guitar);
        assertEquals(69,shop.shopsTotalProfit(),0.01);
    }


}
