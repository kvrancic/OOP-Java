package hr.fer.oop.vjezbe.vjezba4;

public class Car extends Vehicle{
    private String carType;
    private double CargoSpace;

    public Car(String regNo, String model, int year, double price, String carType, double cargoSpace) {
        super(regNo, model, year, price);
        this.carType = carType;
        CargoSpace = cargoSpace;
    }

    public double getCargoSpace() {
        return CargoSpace;
    }

    public void setCargoSpace(double cargoSpace) {
        CargoSpace = cargoSpace;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
