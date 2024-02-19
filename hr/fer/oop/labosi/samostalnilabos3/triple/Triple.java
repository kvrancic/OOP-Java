package hr.fer.oop.labosi.samostalnilabos3.triple;

public class Triple<T> {
    private T first;
    private T second;
    private T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public T getElement(int index) {
        if (index == 1)
            return first;
        if(index == 2)
            return second;
        if(index == 3)
            return third;
        throw new IllegalArgumentException();
    }

    public void setElement(int index, T value) {
        if (index == 1)
            first = value;
        else if(index == 2)
            second = value;
        else if(index == 3)
            third = value;
        else
        throw new IllegalArgumentException();
    }
}
