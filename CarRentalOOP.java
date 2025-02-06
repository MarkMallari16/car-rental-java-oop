package carrentaloop;

public class CarRentalOOP {

    public static void main(String[] args) {
        CarRentalService rentalService = new CarRentalService();

        Car car1 = new Car("Civic", "Honda", 2022, 50);
        Car car2 = new Car("Corolla", "Toyota", 2021, 45);
        Car car3 = new Car("Model 3", "Tesla", 2023, 100);

        rentalService.addCar(car1);
        rentalService.addCar(car2);
        rentalService.addCar(car3);

        Customer customer1 = new Customer("Mark Mallari","A12345");
        Customer customer2 = new Customer("Joseph Cruz","B67890");
        
        rentalService.displayAvailableCars();
        
        rentalService.rentCar(customer1, "Civic");
        
        rentalService.displayAvailableCars();
        rentalService.rentCar(customer2, "Civic");
    }

}
