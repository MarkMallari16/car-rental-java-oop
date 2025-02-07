package carrentaloop;

import java.util.ArrayList;
import java.util.List;

public class CarRentalService {

    private List<Car> cars;

    public CarRentalService() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public boolean rentCar(Customer customer, String model) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && car.isAvailable) {
                car.setAvailable(false);
                customer.setRentedCar(car);
                System.out.println(customer.getName() + " has rented the model " + car.getModel());
                return true;
            }
        }
        
        System.out.println("Sorry not available for rent.");

        return false;
    }

    public void returnCar(Customer customer) {
        Car rentedCar = customer.getRentedCar();

        if (rentedCar != null) {
            rentedCar.setAvailable(true);
            customer.setRentedCar(null);
            System.out.println(customer.getName() + " has returned the " + rentedCar.getModel());
        } else {
            System.out.println(customer.getName() + " has no car to return.");
        }
    }

    public void displayAvailableCars() {
        for (Car car : cars) {
            if (car.isAvailable) {
                System.out.println(car);
            }
        }
    }

}
