package hr.fer.oop.labosi.samostalnilabos;

public class CiklickaZamjena {
    static void swap(int[] arr)
    {
        int[] indexes = new int[3];

        indexes[0] = (int)(Math.random() * arr.length);
        do {
            indexes[1] = (int)(Math.random() * arr.length);
        }while(indexes[0] == indexes[1]);
        do {
            indexes[2] = (int)(Math.random() * arr.length);
        }while(indexes[2] == indexes[1] || indexes[2] == indexes[0]);


        if(indexes[1] > indexes[0])
        {
            int temp = indexes[0];
            indexes[0] = indexes[1];
            indexes[1] = temp;
        }
        if(indexes[2] > indexes[0])
        {
            int temp = indexes[0];
            indexes[0] = indexes[2];
            indexes[2] = temp;
        }
        if(indexes[2] > indexes[1])
        {
            int temp = indexes[1];
            indexes[1] = indexes[2];
            indexes[2] = temp;
        }

        int temp = arr[indexes[2]];
        arr[indexes[2]] = arr[indexes[1]];
        arr[indexes[1]] = arr[indexes[0]];
        arr[indexes[0]] = temp;


    }
}
