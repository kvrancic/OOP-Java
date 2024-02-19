package hr.fer.oop.auditorne.audit9i10.extractemployeefiles;

import hr.fer.oop.labosi.samostalnilabos3.terorija.List;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private java.time.LocalDate date;

    public Employee(String name, double salary, LocalDate date) {
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void raiseSalary(double byPercent){
        this.salary = salary * (1 + byPercent/100);
    }
}
