package carrentaloop;

import java.util.Scanner;

public class CarRentalOOP {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CarRentalService rentalService = new CarRentalService();
        int option;

        rentalService.addCar(new Car("Civic", "Honda", 2022, 50));
        rentalService.addCar(new Car("Model 3", "Tesla", 2023, 100));
        rentalService.addCar(new Car("Corolla", "Toyota", 2021, 45));
        rentalService.addCar(new Car("L300", "Mitsubishi", 2019, 500));
        UserManager userManager = new UserManager();

        while (true) {
            Customer customer = null;

            while (customer == null) {
                System.out.println("=== Car Rental System === ");
                System.out.println("[1] Login");
                System.out.println("[2] Signup");
                System.out.println("[3] Exit");
                System.out.print("Option: ");
                int userOption = input.nextInt();
                input.nextLine();
                String customerId;

                switch (userOption) {
                    case 1:
                        System.out.print("Enter customer id: ");
                        customerId = input.nextLine();

                        customer = userManager.login(customerId);
                        break;
                    case 2:
                        System.out.print("Enter your name: ");
                        String name = input.nextLine();

                        System.out.print("Enter Customer ID: ");
                        customerId = input.nextLine();

                        customer = userManager.createCustomer(name, customerId);
                        break;

                    case 3:
                        input.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid input. Please try again");
                }

            }
            while (true) {
                System.out.println("====================== Welcome back," + customer.getName() + " ======================");
                System.out.println("[1] Display Available Car");
                System.out.println("[2] Rent Car");
                System.out.println("[3] Return Car");
                System.out.println("[4] Log out");
                System.out.print("Option: ");
                option = input.nextInt();

                input.nextLine();

                switch (option) {
                    case 1:
                        rentalService.displayAvailableCars();
                        break;
                    case 2:
                        System.out.print("Enter model of car you want to rent: ");
                        String model = input.nextLine();

                        rentalService.rentCar(customer, model);
                        break;
                    case 3:
                        System.out.print("Enter model of car you want to return: ");
                        String modelReturn = input.nextLine();

                        rentalService.returnCar(customer);
                        break;
                    case 4:
                        customer = null;
                        System.out.println("Logging out....");
                        break;
                    default:
                        System.out.println("Invalid input try again.");
                }
                
                if (customer == null) {
                    break;
                }
            }

        }

    }
}
