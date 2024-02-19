package hr.fer.oop.labosi.samostalnilabos3.keyvalue;

public class SingleTypeKeyValue<T> extends KeyValue<T, T> {

    public SingleTypeKeyValue(T key, T value) {
        super(key, value);
    }
}
