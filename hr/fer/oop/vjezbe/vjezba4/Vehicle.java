package hr.fer.oop.vjezbe.vjezba4;

public class Vehicle {
    private String regNo;
    private String model;
    private int year;
    private double price;

    public Vehicle(String regNo, String model, int year, double price) {
        this.regNo = regNo;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "regNo='" + regNo + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public double getPricePerDay()
    {
        return getPrice()*24;
    }

    public final double getPricePerMonth()
    {
        return getPricePerDay() * 30;
    }

    public static Vehicle getNewestVehicle(Vehicle... vehicles)
    {
        if(vehicles[0] == null) return null;
        int maxYear = vehicles[0].getYear();
        int maxIndex = 0;
        for(int i = 0; i < vehicles.length; i++)
        {
            if(vehicles[i].getYear() > maxYear)
            {
                maxIndex = i;
                maxYear = vehicles[i].getYear();
            }
        }
        return vehicles[maxIndex];
    }

    public static void printAllVehiclesWithCargoSpaceGreaterThan(double volume, Vehicle... vehicles)
    {
        for(Vehicle vehicle : vehicles)
        {
            if(vehicle instanceof Car car)
                if(car.getCargoSpace() > volume) {
                    System.out.println(vehicle);
                }
            if(vehicle instanceof CargoVan cargo)
                if (cargo.getMaxLoad() > volume) {
                    System.out.println(vehicle);
                }
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Car("DA1234AA", "Renault Clio", 2001, 20, "coupe", 200);
        Car car = new Car("DA8818BB", "Renault Megane Grandtour", 2007, 25, "caravan",800);
        Van van1 = new CargoVan("DA0009PO", "Volkswagen Transporter", 2018, 28, 2, (short)3, 4500);
        PassengerVan van2 = new PassengerVan("DA6282EA", "IMV 1600", 1978, 35, 2, (short)3, 0);
        Vehicle limo = new Limo("DA2238AB", "Zastava 750 LE", 1983, 220, 3.2, false, false);
        System.out.println(v.getModel() + " price per day: " + v.getPricePerDay());
        System.out.println(van1.getModel() + " price per day: " + van1.getPricePerDay());
        System.out.println(van2.getModel() + " price per month: " + van2.getPricePerMonth());
        Vehicle newest = Vehicle.getNewestVehicle(v, car, van1, van2, limo);
        System.out.println("Newest: " + newest.getModel() + ", " + newest.getYear());
        Vehicle.printAllVehiclesWithCargoSpaceGreaterThan(500, v, car, van1, van2, limo);

    }


}
