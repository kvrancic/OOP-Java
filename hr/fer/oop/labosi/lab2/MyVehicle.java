package hr.fer.oop.labosi.lab2;

public class MyVehicle extends Vehicle implements DriveVehicle{
    private String model;
    private int totalKm;

    public MyVehicle(String model, VehicleType type, int fuelConsumption, int fuel) {
        super(type, fuelConsumption, fuel);
        this.model = model;
    }

    @Override
    public void drive(int km) {
        int fuel = super.getFuel();
        int fuelConsumption = super.getFuelConsumption();
        if(fuelConsumption * km > fuel) return;
        else {
            super.setFuel(fuel - fuelConsumption * km);
            totalKm += km;
        }
    }

    @Override
    public void addFuel(int fuel) {
        int fuelLeft = super.getFuel();
        if(fuelLeft + fuel > 60) super.setFuel(60);
        else super.setFuel(fuelLeft + fuel);
    }

    @Override
    public String toString() {
        return model + " of type " +super.getType() + " drove for " +
                totalKm +" km and has " +
                super.getFuel() + " l of gas.";
    }
}

