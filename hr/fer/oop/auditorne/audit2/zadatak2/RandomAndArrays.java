package hr.fer.oop.auditorne.audit2.zadatak2;

import static java.lang.Math.random;

public class RandomAndArrays {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int[] array = new int[size];
        for(int i = 0; i < size; i++)
        {
            array[i] = (int)(random() * (100 + 1));
        }
        System.out.println("My array is as following:");
        for(int i = 0; i < size; i++)
        {
            System.out.println(array[i]);;
        }
        System.out.println("My flipped array: ");
        for(int j = size - 1; j >= 0; j--)
        {
            System.out.println(array[j]);
        }
        int Biggest = array[0];
        int Smallest = array[0];
        int IndexOfBiggest = 0;
        int IndexOfSmallest = 0;
        for(int i = 0; i < size; i++)
        {
            if(array[i] > Biggest)
            {
                Biggest = array[i];
                IndexOfBiggest = i + 1;
            }
            if(array[i] < Smallest)
            {
                Smallest = array[i];
                IndexOfSmallest = i + 1;
            }
        }
        System.out.println("The smallest number " + Smallest + " is on the index " + IndexOfSmallest);
        System.out.println("The biggest number " + Biggest + " is on the index " + IndexOfBiggest);


    }
}
