package hr.fer.oop.labosi.samostalnilabos2;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class SHAHasher implements Hasher {
    public byte[] hash(byte[] prevHash, String[] transactions) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] transactionBytes = Arrays.toString(transactions).getBytes(StandardCharsets.UTF_8);
            byte[] data = new byte[prevHash.length + transactionBytes.length];
            System.arraycopy(prevHash, 0, data, 0, prevHash.length);
            System.arraycopy(transactionBytes, 0, data, prevHash.length, transactionBytes.length);
            return digest.digest(Arrays.toString(data).getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException ex) {
            System.exit(1); //this should never happened
            return null;
        }
    }
}

