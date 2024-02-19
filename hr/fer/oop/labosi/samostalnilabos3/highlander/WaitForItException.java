package hr.fer.oop.labosi.samostalnilabos3.highlander;

public class WaitForItException extends RuntimeException {
    public WaitForItException() {
        super("Budget loading...");
    }
}
