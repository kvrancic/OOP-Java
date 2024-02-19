package hr.fer.oop.vjezbe.vjezba6.bank;

public class Salesman extends Worker{
    private double minSalary;
    private double turnover;
    public static final double SALARY_PERCENT = 0.01;

    public Salesman(String name, String bankNumber, double minSalary) {
        super(name, bankNumber);
        this.minSalary = minSalary;
    }

    @Override
    public void paySalary(BankManager bankManager) {
        double amount = minSalary + SALARY_PERCENT * turnover;
        bankManager.payment(this, amount);
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }
}
