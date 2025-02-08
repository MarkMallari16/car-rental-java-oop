package carrentaloop;

import java.util.HashMap;

public class UserManager {

    HashMap<String, Customer> customers;

    public UserManager() {
        customers = new HashMap<>();
    }

    public Customer createCustomer(String name, String customerId) {
        if (customers.containsKey(customerId)) {
            System.out.println("Customer ID already exists. Try a different one.");
            return null;
        }
        Customer customer = new Customer(name, customerId);
        customers.put(customerId, customer);
        System.out.println("Customer created successfully!");

        return customer;
    }

    public Customer login(String customerId) {
        Customer customer = customers.get(customerId);
        if (customer != null) {
            System.out.println("Login successful!");
            return customers.get(customerId);
        } else {
            System.out.println("Customer ID not found. Please sign up.");
            return null;
        }

    }
}
