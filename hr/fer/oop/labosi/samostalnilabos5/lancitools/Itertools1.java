package hr.fer.oop.labosi.samostalnilabos5.lancitools;

import java.util.*;

class Itertools1 {

    private static class ChainIterator<T> implements Iterator<T>{
        private Iterator<T>[] iterators;
        private int current = 0;

        @SafeVarargs
        public ChainIterator(Iterable<T>... iterables) {
            iterators = new Iterator[iterables.length];
            for (int i = 0; i < iterables.length; i++) {
                if(iterables[i].iterator() == null)
                    continue;
                iterators[i] = iterables[i].iterator();
            }
        }

        @Override
        public boolean hasNext() {
            for (Iterator<T> iterator : iterators) {
                if (iterator.hasNext()) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public T next() {
            if(iterators[current] == null) return null;
            if (iterators[current].hasNext()) {
                return iterators[current].next();
            } else {
                current++;
                if (current < iterators.length) {
                    return iterators[current].next();
                }
                if(current == iterators.length){
                    throw new NoSuchElementException();
                }
            }
            return null;
        }
    }

    @SafeVarargs
    public static <T> Iterable<T> chain(Iterable<T>... iterables) {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new ChainIterator<T>(iterables);
            }
        };
    }
}