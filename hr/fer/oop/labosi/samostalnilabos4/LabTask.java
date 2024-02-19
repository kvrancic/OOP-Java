package hr.fer.oop.labosi.samostalnilabos4;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LabTask {
    public static int count(Map<Integer, Integer> map, Set<Integer> set) {
        int counter = 0;
        List<Integer> list = new LinkedList<>();
        for(Integer mapElement : map.values()) {
            if(list.contains(mapElement)) continue;
            list.add(mapElement);
            if (set.contains(mapElement)) counter++;
        }
        return counter;
    }
}
