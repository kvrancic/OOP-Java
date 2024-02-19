package hr.fer.oop.labosi.lab1;

import java.util.Arrays;

public class filtriranjeparnih {
    public static int[] digitsCollector(int[] input)
    {
        int index = 0;
        int[] arr = new int[input.length];
        for(int i = 0; i < input.length; i++)
            if(input[i] % 2 == 0)
                arr[index++] = input[i];

        return Arrays.copyOfRange(arr, 0, index - 1);

    }
}
