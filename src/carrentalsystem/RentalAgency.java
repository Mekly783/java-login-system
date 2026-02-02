package carrentalsystem;

import java.util.ArrayList;

public class RentalAgency {

    private ArrayList<Car> cars;

    // Constructor
    public RentalAgency() {
        cars = new ArrayList<>();
    }

    // Add car to system
    public void addCar(Car car) {
        cars.add(car);
    }

    // Rent car
    public void rentCar(String carId) {
        for (Car car : cars) {
            if (car.getCarId().equals(carId) && car.isAvailable()) {
                car.rentCar();
                System.out.println("Car rented successfully.");
                return;
            }
        }
        System.out.println("Car not available.");
    }

    // Return car
    public void returnCar(String carId) {
        for (Car car : cars) {
            if (car.getCarId().equals(carId)) {
                car.returnCar();
                System.out.println("Car returned successfully.");
                return;
            }
        }
        System.out.println("Car not found.");
    }

    // Display available cars
    public void displayCars() {
        for (Car car : cars) {
            System.out.println(
                car.getCarId() + " - " +
                car.getModel() + " - " +
                (car.isAvailable() ? "Available" : "Rented")
            );
        }
    }
}

