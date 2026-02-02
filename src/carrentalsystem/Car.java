package carrentalsystem;

public class Car {

    private String carId;
    private String model;
    private boolean isAvailable;

    // Constructor
    public Car(String carId, String model) {
        this.carId = carId;
        this.model = model;
        this.isAvailable = true;
    }

    // Rent the car
    public void rentCar() {
        isAvailable = false;
    }

    // Return the car
    public void returnCar() {
        isAvailable = true;
    }

    // Getters
    public String getCarId() {
        return carId;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

