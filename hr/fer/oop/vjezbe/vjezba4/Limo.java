package hr.fer.oop.vjezbe.vjezba4;

public class Limo extends Vehicle{
    private  double length;
    private boolean sunRoof;
    private boolean miniBar;

    public Limo(String regNo, String model, int year, double price, double length, boolean sunRoof, boolean miniBar) {
        super(regNo, model, year, price);
        this.length = length;
        this.sunRoof = sunRoof;
        this.miniBar = miniBar;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPricePerDay()
    {
        return 1.5 * super.getPricePerDay();
    }
}
