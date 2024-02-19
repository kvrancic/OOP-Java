package hr.fer.oop.vjezbe.vjezba6.bank;

public class HourBasedWorker extends Worker {
    private double salaryPerHour;
    private double workingHours;
    private final static double MONTHLY_WORKING_HOUR = 160;
    private final static double OVERTIME_FACTOR = 1.2;


    public HourBasedWorker(String name, String bankNumber, double salaryPerHour) {
        super(name, bankNumber);
        this.salaryPerHour = salaryPerHour;
        this.workingHours = 0;
    }


    @Override
    public void paySalary(BankManager bankManager) {
        double amount = workingHours > 160 ? 160 * salaryPerHour + (workingHours - 160) * OVERTIME_FACTOR * salaryPerHour :
                workingHours * salaryPerHour;
        bankManager.payment(this, amount);
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
}
