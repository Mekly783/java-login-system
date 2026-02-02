package carrentalsystem;

/*
 * Main.java
 * This class is used to test the Car Rental System.
 * It demonstrates adding, renting, and returning cars.
 */

public class Main {

    public static void main(String[] args) {

        // Create Rental Agency
        RentalAgency agency = new RentalAgency();

        // Add cars to the system
        agency.addCar(new Car("C001", "Toyota Corolla"));
        agency.addCar(new Car("C002", "Honda Civic"));

        // Display available cars
        System.out.println("Available cars:");
        agency.displayCars();

        // Rent a car
        System.out.println("\nRenting car C001...");
        agency.rentCar("C001");

        // Display cars after rental
        System.out.println("\nCars after rental:");
        agency.displayCars();

        // Return the car
        System.out.println("\nReturning car C001...");
        agency.returnCar("C001");

        // Display cars after return
        System.out.println("\nCars after return:");
        agency.displayCars();
    }
}
