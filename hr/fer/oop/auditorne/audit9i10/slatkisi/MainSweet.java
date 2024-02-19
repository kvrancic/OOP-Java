package hr.fer.oop.auditorne.audit9i10.slatkisi;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class MainSweet {
    public static void main(String[] args) {
        List<Sweet> sweets = SweetCatalogue.loadSweets();
        theMostDifferent(sweets,
                (a, b) -> (int) Math.abs(a.getSweetness()-b.getSweetness()),
                (a, b) -> { a.setPrice(a.getPrice()+1);
                    b.setPrice(b.getPrice()+1);
                    System.out.println("Price " + a.getName() + " = " + a.getPrice());
                    System.out.println("Price " + b.getName() + " = " + b.getPrice());}
        );
    }

    public static void theMostDifferent(List<Sweet> lista, BiFunction<Sweet, Sweet, Integer> differenceCalculator,
                                        BiConsumer<Sweet, Sweet> action)
    {
        Sweet mostDifferentA = null;
        Sweet mostDifferentB = null;
        int biggestDifference = Integer.MIN_VALUE;

        for(Sweet a : lista){
            for(Sweet b : lista){
                if(a == b) continue;
                if(differenceCalculator.apply(a, b) > biggestDifference){
                    mostDifferentA = a;
                    mostDifferentB = b;
                    biggestDifference = differenceCalculator.apply(a, b);
                }
            }
        }
        action.accept(mostDifferentA, mostDifferentB);
    }
}
