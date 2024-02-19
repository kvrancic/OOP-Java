package hr.fer.oop.labosi.samostalnilabos4.studenti2do4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Util {
    public static void addGrade(String studentId, int courseId, Grade grade,
                                Map<String, Map<Integer, Grade>> grades) throws IllegalArgumentException{
    if(!grades.containsKey(studentId)){
        grades.put(studentId, new HashMap<>());
    }
    if(grades.get(studentId).get(courseId) == Grade.INSUFFICIENT || grades.get(studentId).get(courseId) == grade)
    {
        grades.get(studentId).replace(courseId, grade);
    }
    else if (grades.get(studentId).get(courseId) == null)
        grades.get(studentId).put(courseId, grade);
    else
        throw new IllegalArgumentException();
    }

}
