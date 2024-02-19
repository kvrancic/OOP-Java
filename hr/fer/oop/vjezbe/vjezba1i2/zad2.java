package hr.fer.oop.vjezbe.vjezba1i2;

import static java.lang.Math.sqrt;

public class zad2 {
    public static void main(String[] args) {
        double pi = Math.PI;
        int brojac = 0;
        double suma = 0;
        while(pi - sqrt(6*suma) > 0.00001)
        {
            ++brojac;
            suma += 1. / ((double)brojac * brojac);
            System.out.println(sqrt(6*suma));
        }

        System.out.println("Potreban broj koraka: " + brojac);

    }
}
