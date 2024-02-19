package hr.fer.oop.labosi.samostalnilabos3.anteinkeyvalue;

public class KeyValue<K, V> {
    private K key;
    private V value;

    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

   public static  <T extends Comparable<T>> KeyValue<T, T>[] copy(KeyValue<T, T>... input)
    {
        if(input == null || input.length == 0)
            return null;
        int counter = 0;
        T checker = input[0].getValue();
        T tester;
        for(int i = 1; i < input.length; i++){
            tester = input[i].getValue();
            if(tester.compareTo(checker) > 0){
                counter++;
                checker = tester;
            }
        }
        KeyValue<T, T>[] output = (KeyValue<T, T>[])new KeyValue<?, ?>[counter];
        output[0] = input[0];

        int writer = 1;
        checker = input[0].getValue();
        for(int i = 0; i < input.length; i++){
            tester = input[i].getValue();
            if(tester.compareTo(checker) > 0){
                output[writer] = input[writer];
                writer++;
            }
        }
        return output;
    }

}
