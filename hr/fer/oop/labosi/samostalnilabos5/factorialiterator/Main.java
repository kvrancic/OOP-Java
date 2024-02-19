package hr.fer.oop.labosi.samostalnilabos5.factorialiterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Iterator<Integer> iterator = new FactorialIterator(10);
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
