package hr.fer.oop.labosi.samostalnilabos5.lancitools;

import java.util.*;

class Itertools {
    public static <T> Iterable<T> chain(Iterable<T>... args) {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new ChainIterator<T>(args);
            }
        };
    }

    private static class ChainIterator<T> implements Iterator<T>, Iterable<T> {
        private LinkedList<T> l;
        public ChainIterator(Iterable<T>... args){
            this.l = new LinkedList<>();
            for(Iterable<T> arg : args){
                Iterator<T> it = arg.iterator();
                while (it.hasNext()) l.add(it.next());
            }
        }

        @Override
        public boolean hasNext() {
            return !l.isEmpty();
        }

        @Override
        public T next() {
            if(l.isEmpty()) throw new NoSuchElementException();
            return l.removeFirst();
        }
        @Override
        public Iterator<T> iterator() {
            return l.iterator();
        }
    }



}