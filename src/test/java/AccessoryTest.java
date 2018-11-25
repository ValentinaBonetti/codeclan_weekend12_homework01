import accessories.Accessory;
import accessories.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void setUp() throws Exception {
        accessory = new Accessory(43546245, Category.DRUM_STICK, "Amazing drum sticks", "Yukinis", "SuperDuper", 3.50, 8.10);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.6,accessory.calculateMarkup(),0.01);
    }
}
