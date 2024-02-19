package hr.fer.oop.vjezbe.vjezba4;

import java.util.Objects;

public class Teacher extends Person {
    private String email;
    private String subject;
    private double salary;

    public Teacher(String name, String surname, int age, String email, String subject, double salary) {
        super(name, surname, age);
        this.email = email;
        this.subject = subject;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return email.equals(teacher.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    public void increaseSalary(int percentage)
    {
        salary *= 1. + (double)percentage / 100;
    }

    public static void increaseSalary(int percentage, Teacher...teachers){
        for (Teacher teacher : teachers)
            teacher.increaseSalary(percentage);
    }
}
