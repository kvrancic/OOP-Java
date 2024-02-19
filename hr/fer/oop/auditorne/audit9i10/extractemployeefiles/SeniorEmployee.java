package hr.fer.oop.auditorne.audit9i10.extractemployeefiles;

import java.util.function.Predicate;

public class SeniorEmployee implements Predicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getSalary() >= 100000;
    }
}
