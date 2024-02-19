package hr.fer.oop.auditorne.audit8;

import java.util.HashSet;
import java.util.Set;

public class SetOperations<T> {
    public static <T> Set<T> Union (Set<T> firstSet,  Set<T> secondSet){
        Set<T> set = new HashSet<>(firstSet);
        set.addAll(secondSet);
        return set;
    }

    public static <T> Set<T> Intersection (Set<T> firstSet,  Set<T> secondSet){
        var set = new HashSet<T>(firstSet);
        set.retainAll(secondSet);
        return set;
    }

    public static <T> Set<T> Difference (Set<T> firstSet,  Set<T> secondSet){
        var set = new HashSet<T>(firstSet);
        set.removeAll(secondSet);
        return set;
    }


    public static void main(String[] args) {
        var set1 = Set.of(1,2,3,4,5);
        var set2 = Set.of(1,2,4,5,67,6);

        System.out.println(Union(set1, set2));
    }
}
