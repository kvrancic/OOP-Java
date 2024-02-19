package hr.fer.oop.auditorne.audit8.grades;

import java.util.HashMap;
import java.util.Map;

public class GradesA {
    Map<String, Integer> map;

    public GradesA(){
        map = new HashMap<>();
    }

    public void Add(String name, Integer grade)
    {
        map.put(name,grade);
    }

    public void AverageGrade()
    {
        double sum = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            sum += entry.getValue();
        }
        System.out.println("Average grade is " + sum/map.size());
    }

}
