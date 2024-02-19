package hr.fer.oop.labosi.lab4;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution implements StudentStatistics {
    Map<String, LinkedList<Integer>> map = new LinkedHashMap<>();

    @Override
    public void addStudentPoints(String student, Integer... points) {
        if(!map.containsKey(student)){
            map.put(student, new LinkedList<>());
        }
        map.get(student).addAll(List.of(points));
    }

    @Override
    public Integer getTotalPoints() {
        int total = 0;
        for(LinkedList<Integer> allScoresSingleStudent : map.values()){
            for(Integer singleScore : allScoresSingleStudent){
                total += singleScore;
            }
        }
        return total;
    }


    @Override
    public Integer getStudentSize() {
        return map.size();
    }

    @Override
    public Integer getTotalPointsForStudent(String student) {
        int total = 0;
        if(!map.containsKey(student)) return null;
        else{
            for(Integer i : map.get(student))
                total += i;
        }

        return total;
    }
}
