package carrentalsystem;
/*
 * RentalAgency.java
 * This class manages cars and rental operations.
 * It allows adding, renting, returning, and displaying cars.
 */

import java.util.ArrayList;

public class RentalAgency {

    // List to store cars in the agency
    private ArrayList<Car> cars;

    // Constructor initializes the car list
    public RentalAgency() {
        cars = new ArrayList<>();
    }

    // Method to add a car to the agency
    public void addCar(Car car) {
        cars.add(car);
    }

    // Method to display all cars and their status
    public void displayCars() {
        for (Car car : cars) {
            System.out.println(
                car.getCarId() + " - " +
                car.getModel() + " - " +
                (car.isAvailable() ? "Available" : "Rented")
            );
        }
    }

    // Method to rent a car by ID
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

    // Method to return a rented car by ID
    public void returnCar(String carId) {
        for (Car car : cars) {
            if (car.getCarId().equals(carId) && !car.isAvailable()) {
                car.returnCar();
                System.out.println("Car returned successfully.");
                return;
            }
        }
        System.out.println("Car not found or already available.");
    }
}

