package hr.fer.oop.labosi.samostalnilabos5.fibonacciiterator1;

class FibonacciIterator implements  java.util.Iterator<Integer>{
    private int[] fibonacci = new int[] {0,1};
    private int count = 0;
    private int maxCount;

    public FibonacciIterator(int maxCount) {
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
        int returnValue = fibonacci[0];
        fibonacci[0] = fibonacci[1];
        fibonacci[1] = returnValue + fibonacci[1];
        count++;
        return returnValue;
    }
}

