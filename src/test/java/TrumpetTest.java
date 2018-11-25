import instruments.Colour;
import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet(300202,"SuperTrump", "Parapo", InstrumentType.BRASS,"Brass", Colour.GOLD,5686.0,9867.05,2);
    }

    @Test
    public void canPlay() {
        assertEquals("Paraparapapaaaa",trumpet.play());
    }
}
