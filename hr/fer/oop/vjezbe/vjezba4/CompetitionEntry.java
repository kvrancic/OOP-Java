package hr.fer.oop.vjezbe.vjezba4;

import org.jetbrains.annotations.NotNull;

public class CompetitionEntry {
    private Teacher teacher;
    private Dessert dessert;
    private Student[] students;
    private int[] ratings;
    private int index;

    public CompetitionEntry(Teacher teacher, Dessert dessert) {
        this.teacher = teacher;
        this.dessert = dessert;
        this.students = new Student[3];
        this.ratings = new int[3];
        index = 0;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public Student[] getStudents() {
        return students;
    }

    public int[] getRatings() {
        return ratings;
    }

    public boolean addRating (Student student, int rating) {
        if (index == 3) return false; //full

        for (Student s : students) {
            if (s != null && s.equals(student))
                return false; //already in
        }

        students[index] = student;
        ratings[index] = rating;
        index++;
        return true;
    }

    public double getRating()
    {
        int ratingsum = 0;
        int ratingcount = 0;
        for(int rating: ratings)
        {
            ratingsum += rating;
            ratingcount++;
        }
        if (ratingcount == 0)
            return 0;

        return (double) ratingsum / ratingcount;
    }
}
