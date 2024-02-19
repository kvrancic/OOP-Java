package hr.fer.oop.labosi.lab3;

public class Main {
    public static void main(String[] args) {
        KeyValue<Integer, Integer>[] arr = (KeyValue<Integer, Integer>[]) new KeyValue<?, ?>[]
                {new KeyValue<>(2, 5), new KeyValue<>(-4,4), new KeyValue<>(7, -4), new KeyValue<>(10, 5)};
        arr = KeyValue.copy(arr);
        System.out.println(arr.length);// 3
        System.out.println(arr[0].getKey() + ", " + arr[0].getValue());// 2, 5
        System.out.println(arr[1].getKey() + ", " + arr[1].getValue());// 7, -4
        System.out.println(arr[2].getKey() + ", " + arr[2].getValue());// 10, 5
    }
}
