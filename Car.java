package carrentaloop;

public class Car {

    private String model;
    private String brand;
    private int year;
    private double rentalPricePerDay;
    public boolean isAvailable;

    public Car(String model, String brand, int year, double rentalPricePerDay) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Car ["
                + "Model='" + model + '\''
                + "Brand='" + brand + '\''
                + "Year= " + year
                + "Rental Price Per Day =" + rentalPricePerDay
                + "Available=" + (isAvailable ? "Yes" : "No")
                + ']';
    }

}
