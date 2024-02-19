package hr.fer.oop.labosi.samostalnilabos5.particije;


import java.util.*;
import java.util.function.Function;

public class PartitionCollection {
    static <K, T> Map<K, Set<T>> partition(Collection<T> coll, Function<T, K> keyExtractor) {
        //The partition method receives a collection of objects Collection <T> and classifies them into classes based on the received function Function <T, K> which for each object of type T returns the "key" of the class of type K to which it belongs. Objects of a certain class are saved in a set which is in the folder under the corresponding class key.
        Map<K, Set<T>> map = new HashMap<>();
        for (T t : coll) {
            K key = keyExtractor.apply(t);
            Set<T> set = map.computeIfAbsent(key, k -> new HashSet<>());
            set.add(t);
        }
        return map;
    }
}
