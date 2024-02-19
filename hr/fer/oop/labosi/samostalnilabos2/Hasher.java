package hr.fer.oop.labosi.samostalnilabos2;

public interface Hasher {
    public byte[] hash(byte[] prevHash, String[] transactions);
}
