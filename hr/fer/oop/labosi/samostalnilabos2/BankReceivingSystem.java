package hr.fer.oop.labosi.samostalnilabos2;

class BankReceivingSystem implements ReceivingSystem{

    private int emergencyQueue = 0;
    private int regularQueue = 0;
    private boolean employeeIsBusy = false;
    private int customersArrived = 0;
    private int customersLeft = 0;



    @Override
    public void customerArrived(boolean urgent) {
        customersArrived++;
        calculateEmployeeStatus();
        if(urgent)
            emergencyQueue++;
        else
            regularQueue++;
    }

    @Override
    public void customerLeft(boolean urgent) {
        customersLeft++;
        calculateEmployeeStatus();
        if(urgent)
            emergencyQueue--;
        else
            regularQueue--;
    }

    @Override
    public void calculateEmployeeStatus() {
        if (customersLeft == customersArrived)
            employeeIsBusy = false;
        else
            employeeIsBusy = true;
    }

    @Override
    public int getUrgentListSize() {
        return emergencyQueue;
    }

    @Override
    public int getNonUrgentListSize() {
        return regularQueue;
    }

    @Override
    public boolean isEmployeeOccupied() {
        return employeeIsBusy;
    }

    @Override
    public int getNumberOfArrivedCustomers() {
        return customersArrived;
    }
}
