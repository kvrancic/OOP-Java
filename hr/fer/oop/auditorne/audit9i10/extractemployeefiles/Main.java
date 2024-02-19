package hr.fer.oop.auditorne.audit9i10.extractemployeefiles;

import java.io.IOException;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Employee> employees = EmployeeLoader.loadFromFile("data.txt");

        for(Employee e : employees){
                System.out.println(e);
        }

        System.out.println("*** Junior employees ***");
        printEmployees(employees, new JuniorEmployee());

        System.out.println("*** Senior employees ***");
        printEmployees(employees, new SeniorEmployee());

        //increase salary of all workers for 15%
        employees.forEach(e -> e.raiseSalary(1.15));

        System.out.println("*** Junior employees after raise ***");
        printEmployees(employees, new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary() < 80000;
            }
        });

        System.out.println("*** Senior employees after raise ***");
        printEmployees(employees, e -> e.getSalary() >= 100000);

        //print two most similar employees
        theMostSimilarEmployees(employees,
                (a, b) -> (int)(Math.abs((a.getDate().toEpochDay() - b.getDate().toEpochDay()))));

    }

    public static void printEmployees(Iterable<Employee> employees, Predicate<Employee> predicate) {
        for(Employee e : employees)
            if (predicate.test(e))
                System.out.println(e);
    }

    public static void theMostSimilarEmployees(Iterable<Employee> employees, BiFunction<Employee, Employee,
                Integer> similarityFunction){
        Employee similarA = null;
        Employee similarB = null;
        int minSimilarityValue = Integer.MAX_VALUE;

        for(Employee a : employees){
            for(Employee b : employees){
                if(a == b) continue;
                if(similarityFunction.apply(a, b) < minSimilarityValue){
                    similarA = a;
                    similarB = b;
                    minSimilarityValue = similarityFunction.apply(a,b);
                }
            }
        }
        System.out.println("The most similar are: " + similarA + " and " + similarB);
    }
}
