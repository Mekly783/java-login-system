package carrentalsystem;
/*
 * Customer.java
 * This class represents a customer in the Car Rental System.
 * It stores customer information.
 */

public class Customer {

    // Unique customer ID
    private String customerId;

    // Name of the customer
    private String name;

    // Constructor to initialize customer details
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // Method to get customer ID
    public String getCustomerId() {
        return customerId;
    }

    // Method to get customer name
    public String getName() {
        return name;
    }
}

