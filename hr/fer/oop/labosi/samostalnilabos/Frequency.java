package hr.fer.oop.labosi.samostalnilabos;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int someArray[] = new int[] {1,2,6,9,4,2,6,8,3,6,2,6};
        int resultArray[] = frequency(someArray);
        for(int num: resultArray)
        {
            System.out.print(num);
            System.out.print(", ");
        }
        System.out.println();
    }

    public static int[] frequency(int[] arr)
    {
        int counter = 0;
        int [] frequency = new int[2*arr.length];
        int index = 0;
        boolean first = true;
        for(int i = 0; i < arr.length; i++)
        {
            first = true;
            for(int k = 0; k < i; k++)
            {
                if (arr[i] == arr[k]) {
                    first = false;
                    break;
                }
            }

            if(first == true)
            {
                frequency[index++] = arr[i];
                counter = 0;
                for(int j = i; j < arr.length; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        counter++;
                    }
                }
                frequency[index++] = counter;
            }
        }


        return Arrays.copyOfRange(frequency,0,index);
    }

}
