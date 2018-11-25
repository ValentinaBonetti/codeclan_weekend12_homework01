package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    protected Integer idNumber;
    protected String make;
    protected String model;
    protected InstrumentType type;
    protected String material;
    protected Colour colour;
    protected Double buying_price, selling_price;

    public Instrument(Integer idNumber, String make, String model, InstrumentType type, String material, Colour colour, Double buying_price, Double selling_price) {
        this.idNumber = idNumber;
        this.make = make;
        this.model = model;
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.buying_price = buying_price;
        this.selling_price = selling_price;
    }

    public double calculateMarkup() {
        return this.selling_price - this.buying_price;
    }

}
