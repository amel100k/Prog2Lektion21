package opgave03.models.decorator;

import opgave03.models.VehicleComponet;

public class Rental extends RentalDecorator{
    private int rentalPrice;
    private boolean rented = false;

    public Rental(VehicleComponet decorated, int rentalPrice) {
        super(decorated);
        this.rentalPrice = rentalPrice;

    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public boolean isRented() {
        return rented;
    }
    public void setRented(boolean rented){
        this.rented = rented;
    }
}
