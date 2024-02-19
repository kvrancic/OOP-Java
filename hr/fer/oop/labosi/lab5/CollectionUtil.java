package hr.fer.oop.labosi.lab5;

import hr.fer.oop.labosi.lab2priprema.teorija.constructorinheritancePR.R;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CollectionUtil {
    public static <T, R> List<R> myFilterMap(Collection<T> coll, Predicate<T> pred, Function<T, R> fun){
        List<R> buffer = new LinkedList<>();
        for(T t : coll){
            if(pred.test(t)){
                R item = fun.apply(t);
                buffer.add(item);
            }

        }
        return buffer;

    }

    public static void main(String[] args) {
        System.out.println(myFilterMap(Arrays.asList(2, 3, 6, 8, 14,3), x->x%2==0, x->x*x));
    }
}
