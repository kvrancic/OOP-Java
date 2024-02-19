package hr.fer.oop.labosi.samostalnilabos4.studentscore;

import java.util.*;

public class Solution implements StudentScoreStatistics {

    Map<String, LinkedList<Integer>> map;


    public Solution() {
        map = new LinkedHashMap<>();
    }

    @Override
    public void addStudentScores(String student, Integer... scores) {
        if(!map.containsKey(student))
            map.put(student, new LinkedList<>());
        map.get(student).addAll(List.of(scores));
    }

    @Override
    public Collection<String> getInsertionOrderedStudents() {
        return map.keySet();
    }

    @Override
    public Collection<Integer> getNaturallySortedPointsForStudent(String student) {
        if(!map.containsKey(student)) return null;
        Collections.sort(map.get(student));
        return map.get(student);
    }
}
