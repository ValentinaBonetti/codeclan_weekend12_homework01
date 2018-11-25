package accessories;

import behaviours.ISell;

public class Accessory implements ISell {

    private Integer idNumber;
    private Category category;
    private String description;
    private String make;
    private String model;
    private Double buying_price, selling_price;

    public Accessory(Integer idNumber, Category category, String description, String make, String model, Double buying_price, Double selling_price) {
        this.idNumber = idNumber;
        this.category = category;
        this.description = description;
        this.make = make;
        this.model = model;
        this.buying_price = buying_price;
        this.selling_price = selling_price;
    }

    public double calculateMarkup() {
        return this.selling_price - this.buying_price;
    }

}
