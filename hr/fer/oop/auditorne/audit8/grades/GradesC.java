package hr.fer.oop.auditorne.audit8.grades;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradesC {
    Map<String, Map<String, Integer>> map;

    public GradesC() {
        map = new HashMap<>();
    }

    public void add(String name, String course, Integer grade)
    {
        Map<String, Integer> courses = map.get(name);
        if(courses == null){
            courses = new HashMap<>();
            map.put(name, courses);
        }
        courses.put(course, grade);
    }

    public void AverageGrade(String course){
        double sum = 0;
        double count = 0;
        for(String name : map.keySet())
        {
            Map<String, Integer> courses = map.get(name);
            if(courses.containsKey(course)){
                sum += courses.get(course);
                count++;
            }
        }
        System.out.println("Average course grade: " + sum/count);

    }

    public static void main(String[] args) {

        GradesC g = new GradesC();

        g.add("Marko", "OOP", 5);
        g.add("Iva", "OOP", 3);
        g.add("Ivana", "OOP", 5);
        g.add("Matteo", "OOP", 2);
        g.add("Mario", "OOP", 1);

        g.add("Mario", "ARH", 4);
        g.add("Matteo", "ARH", 5);

        g.AverageGrade("ARH");

    }
}
