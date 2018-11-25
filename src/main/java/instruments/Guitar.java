package instruments;

public class Guitar extends Instrument {

    private Integer number_of_strings;

    public Guitar(Integer idNumber, String make, String model, InstrumentType type, String material, Colour colour, Double buying_price, Double selling_price, Integer number_of_strings) {
        super(idNumber, make, model, type, material, colour, buying_price, selling_price);
        this.number_of_strings = number_of_strings;
    }

    public String play() {
        return "Sdeooong sdeoooong";
    }


}
