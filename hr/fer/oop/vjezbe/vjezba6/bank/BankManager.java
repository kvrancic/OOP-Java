package hr.fer.oop.vjezbe.vjezba6.bank;

public class BankManager {
    public BankManager() {
    }

    public void payment(Worker worker, double amount) {
        System.out.println(worker.getName() + " - " + worker.getBankNumber() + ": " +
                amount);
    }

}
