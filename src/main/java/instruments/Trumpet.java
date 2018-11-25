package instruments;

public class Trumpet extends Instrument {

    private Integer number_of_valves;

    public Trumpet(Integer idNumber, String make, String model, InstrumentType type, String material, Colour colour, double buying_price, double selling_price, Integer number_of_valves) {
        super(idNumber, make, model, type, material, colour, buying_price, selling_price);
        this.number_of_valves = number_of_valves;
    }

    public String play() {
        return "Paraparapapaaaa";
    }
}
