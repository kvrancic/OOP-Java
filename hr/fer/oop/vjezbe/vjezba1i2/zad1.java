package hr.fer.oop.vjezbe.vjezba1i2;

import static java.lang.Math.pow;

public class zad1 {
    public static void main(String[] args) {
        double pi;
        for(int i = 10; i <= 1000000; i = i * 10)
        {
            pi = 0;
            for(int j = 0; j < i; j++)
            {
                pi += pow(-1, j) / (2*j + 1);
            }
            pi = pi * 4;
            System.out.printf("Pi dobijen od %d sumanada iznosi %.10f", i, pi);
        }
    }
}
