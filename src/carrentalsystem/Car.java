package carrentalsystem;
/*
 * Car.java
 * This class represents a car in the Car Rental System.
 * It stores car details and manages renting and returning of cars.
 */

public class Car {

    // Unique identifier for the car
    private String carId;

    // Model name of the car
    private String model;

    // Availability status of the car
    private boolean available;

    // Constructor to initialize car details
    public Car(String carId, String model) {
        this.carId = carId;
        this.model = model;
        this.available = true; // Car is available by default
    }

    // Method to get car ID
    public String getCarId() {
        return carId;
    }

    // Method to get car model
    public String getModel() {
        return model;
    }

    // Method to check if car is available
    public boolean isAvailable() {
        return available;
    }

    // Method to rent the car
    public boolean rentCar() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    // Method to return the car
    public void returnCar() {
        available = true;
    }
}

