package hr.fer.oop.auditorne.audit8.grades;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GradesB {
    Map<String, List<Integer>> map;

    public GradesB(){
        map = new HashMap<>();
    }

    public void add(String name, Integer grade)
    {
        List<Integer> values = map.get(name);
        if(values == null){
            values = new LinkedList<Integer>();
            map.put(name, values);
        }
        values.add(grade);
    }

    public void AverageGrade()
    {
        for(String entry : map.keySet())
        {
            double count = 0;
            double sum = 0;
            for (Integer i : map.get(entry))
            {
                sum += i;
                count++;
            }
            System.out.println("Student " + entry + " average grade is " + sum/count);
        }
    }

    public static void main(String[] args) {
        GradesB g = new GradesB();

        g.add("Marko", 5);
        g.add("Iva", 3);
        g.add("Ivana", 5);
        g.add("Matteo", 2);
        g.add("Mario", 1);

        g.add("Mario", 4);
        g.add("Mario", 4);

        g.AverageGrade();
    }
}