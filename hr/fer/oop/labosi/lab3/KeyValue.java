package hr.fer.oop.labosi.lab3;

public class KeyValue <K, V>{
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

    public static  <Thing extends Comparable<Thing>> KeyValue<Thing, Thing>[] copy(KeyValue<Thing, Thing>... unsorted)
    {
        if(unsorted == null || unsorted.length == 0) return null;
        int counter = 1;
        Thing validator = unsorted[0].getKey();
        Thing opposition;
        for(int i = 1; i < unsorted.length; i++){
            opposition = unsorted[i].getKey();
            if(validator.compareTo(opposition) <= 0)
            {
                ++counter;
                validator = opposition;
            }
        }
        KeyValue<Thing, Thing>[] sorted = (KeyValue<Thing, Thing>[])new KeyValue<?, ?>[counter];

        sorted[0] = new KeyValue<Thing,Thing>(unsorted[0].key, unsorted[0].value);
        int fillerIndex = 1;
        validator = unsorted[0].getKey();
        for(int i = 1; i < unsorted.length; i++){
            opposition = unsorted[i].getKey();
            if(opposition.compareTo(validator) >= 0){
                sorted[fillerIndex] = new KeyValue<Thing,Thing>(unsorted[i].key, unsorted[i].value);;
                validator = opposition;
                fillerIndex++;
            }
        }
        return sorted;
    }

}
