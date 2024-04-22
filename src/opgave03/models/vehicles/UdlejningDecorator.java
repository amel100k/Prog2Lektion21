package opgave03.models.vehicles;

public class UdlejningDecorator {
    Vehicle vehicle;
    private boolean udlejet = false;
    private double lejePris;

    public UdlejningDecorator(Vehicle vehicle, boolean udlejet, double lejePris) {
        this.vehicle = vehicle;
        this.udlejet = udlejet;
        this.lejePris = lejePris;
    }
}
