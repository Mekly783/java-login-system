package carrentalsystem;

public class Main {

    public static void main(String[] args) {

        RentalAgency agency = new RentalAgency();

        // Test data
        Car car1 = new Car("C001", "Toyota Corolla");
        Car car2 = new Car("C002", "Honda Civic");

        agency.addCar(car1);
        agency.addCar(car2);

        System.out.println("Available cars:");
        agency.displayCars();

        System.out.println("\nRenting car C001...");
        agency.rentCar("C001");

        System.out.println("\nCars after rental:");
        agency.displayCars();

        System.out.println("\nReturning car C001...");
        agency.returnCar("C001");

        System.out.println("\nCars after return:");
        agency.displayCars();
    }
}
