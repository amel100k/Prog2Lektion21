package opgave03.models.decorator;

import opgave03.models.VehicleComponet;
import opgave03.models.vehicles.Vehicle;

public class RentalDecorator extends VehicleComponet {
    VehicleComponet decorated;

    public RentalDecorator(VehicleComponet decorated) {
        this.decorated = decorated;
    }

    @Override
    public String toString() {
        return decorated.toString();
    }
}
