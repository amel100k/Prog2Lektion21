package opgave03;

import opgave03.models.decorator.Rental;
import opgave03.models.vehicles.*;

import java.util.List;

public class Opgave03 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Car("Ford", "Mustang", CarType.SEDAN),
                new Car("Nissan", "Leaf", CarType.HATCHBACK),
                new Car("Volkswagen", "Golf", CarType.CABRIOLET),
                new Motorcycle("Harley-Davidson", "Street Bob", 700),
                new Motorcycle("Kawasaki", "Ninja", 1000)
        );
        Rental rental = new Rental(vehicles.get(0),1000);
        System.out.println("rental.toString() = " + rental.toString());
        //vehicles.forEach(System.out::println);
    }
}
