package hr.fer.oop.labosi.samostalnilabos5.factorialiterator;

public class FactorialIterator implements java.util.Iterator<Integer> {
    private int count = 0;
    private int maxCount;

    public FactorialIterator(int maxCount) {
        if(maxCount < 0) {
            throw new IllegalArgumentException();
        }
        this.maxCount = maxCount;
    }

    @Override
    public boolean hasNext() {
        return count != maxCount;
    }

    @Override
    public Integer next() {
        if(!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int returnValue = 1;
        for(int i = 1; i <= count; i++)
            returnValue *= i;
        count++;
        return returnValue;
    }
}

