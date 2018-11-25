import accessories.Accessory;
import accessories.Category;
import instruments.Colour;
import instruments.Guitar;
import instruments.Instrument;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop musicShop;
    Instrument guitar;
    Accessory accessory;

    @Before
    public void setUp() throws Exception {
        musicShop = new Shop("Music Shop","Glasgow city centre");
        guitar = new Guitar(2430752,"Yamaha","Classic 101", InstrumentType.STRING,"Wood", Colour.WHITE, 2340.0, 3456.60, 5);
        accessory = new Accessory(43546245, Category.DRUM_STICK, "Amazing drum sticks", "Yukinis", "SuperDuper", 3.50, 8.10);
    }

    @Test
    public void hasName() {
        assertEquals("Music Shop",musicShop.name());
    }

    @Test
    public void hasLocation() {
        assertEquals("Glasgow city centre",musicShop.location());
    }

    @Test
    public void canCountItemsInStock() {
        assertEquals(0, musicShop.countItemsInStock());
    }

    @Test
    public void canAddInstrumentToStock() {
        musicShop.addItemToStock(guitar);
        assertEquals(1,musicShop.countItemsInStock());
    }

    @Test
    public void canRemoveInstrumentFromStock() {
        musicShop.addItemToStock(guitar);
        musicShop.addItemToStock(accessory);
        musicShop.removeItemFromStock(accessory);
        assertEquals(1,musicShop.countItemsInStock());
    }

    @Test
    public void canCalculatePotentialProfit() {
        musicShop.addItemToStock(guitar);
        musicShop.addItemToStock(accessory);
        assertEquals(1121.19, musicShop.calculatePotentialProfit(),0.01);
    }
}
