package hr.fer.oop.labosi.lab2;

public abstract class Vehicle {
        private VehicleType type;
        private int fuelConsumption;
        private int fuel;

        public Vehicle(VehicleType type, int fuelConsumption, int fuel) {
            super();
            this.type = type;
            this.fuelConsumption = fuelConsumption;
            this.fuel = fuel;
        }

        public VehicleType getType() {
            return type;
        }

        public void setType(VehicleType type) {
            this.type = type;
        }

        public int getFuelConsumption() {
            return fuelConsumption;
        }

        public void setFuelConsumption(int fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuelTank) {
            this.fuel = fuelTank;
        }
    }

