import instruments.Colour;
import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(2430752,"Yamaha","Classic 101", InstrumentType.STRING,"Wood", Colour.WHITE, 2340.0, 3456.60, 5);
    }

    @Test
    public void canPlay() {
        assertEquals("Sdeooong sdeoooong",guitar.play());
    }


}
