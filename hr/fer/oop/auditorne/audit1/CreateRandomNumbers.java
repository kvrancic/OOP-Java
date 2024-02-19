package hr.fer.oop.auditorne.audit1;

import static java.lang.Math.abs;
import static java.lang.Math.random;

public class CreateRandomNumbers {
    public static void main(String[] args) {
        int LowerBound = Integer.parseInt(args[0]);
        int UpperBound = Integer.parseInt(args[1]);
        if(args.length != 2)
            System.out.println("Program requires upper and lower bound");
        else if(LowerBound > UpperBound)
            System.out.println("Invalid bounds");
        else {
            int span = UpperBound - LowerBound;
            int number1;
            int number2;
            do {
                number1 = (int) (random() * (span + 1) + LowerBound);
                number2 = (int) (random() * (span + 1) + LowerBound);
            } while (number1 == number2);

            System.out.printf("Two different random numbers in range [%d, %d] are %d and %d\n", LowerBound, UpperBound, number1, number2);
        }
    }
}
