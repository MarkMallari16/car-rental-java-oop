package carrentaloop;

public class Customer {

    private String name;
    private String licenseNumber;
    private Car rentedCar;

    public Customer(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rentedCar = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(Car rentedCar) {
        this.rentedCar = rentedCar;
    }

    @Override
    public String toString() {
        return "Customer("
                + "Name='" + name + '\''
                + ", License Number='" + licenseNumber + '\''
                + ", Rented Car=" + (rentedCar != null ? rentedCar.getModel() : "None")
                + ')';
    }
}
