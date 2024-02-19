package hr.fer.oop.labosi.samostalnilabos5.student;

public class Student {
    public String name, surname;
    public int age;
    public int [] grades;

    public Student(String name, String surname, int age, int [] grades) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.grades = grades;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

    public double averageGrade() {
        double zbroj=0;
        for(int i=0;i<grades.length;i++) zbroj += grades[i];
        return zbroj/grades.length;
    }

    static class GermanStudent extends Student{

        public GermanStudent(String name, String surname, int age, int[] grades) {
            super(name, surname, age, grades);
        }

        @Override
        public double averageGrade() {
            double zbroj=0;
            for(int i=0;i<grades.length;i++) zbroj += 6 - grades[i];
            return zbroj/grades.length;
        }
    }

    static class AmericanStudent extends Student{

        public AmericanStudent(String name, String surname, int age, char[] AlphabeticGrades) {
            //create constructor matching super with empty grades
            super(name, surname, age, new int[AlphabeticGrades.length]);
            int j = 0;
            for(char grade : AlphabeticGrades){
                switch (grade) {
                    case 'A' -> grades[j] = 5;
                    case 'B' -> grades[j] = 4;
                    case 'C' -> grades[j] = 3;
                    case 'D' -> grades[j] = 2;
                    case 'F' -> grades[j] = 1;
                }
                j++;
            }

        }
        @Override
        public double averageGrade() {
            double zbroj=0;
            for(int i=0;i<grades.length;i++) zbroj += grades[i];
            return zbroj/grades.length;
        }
    }

    public static void main(String[] args) {
        int [] gradesCroat = {3,4,5};
        int [] gradesGerman = {1,2,1};
        char [] gradesAmerican = {'A','B','A'};

        Student croat = new Student("Mate", "Juric", 30, gradesCroat);
        Student german = new GermanStudent("Hans", "Zimmer", 40, gradesGerman);
        Student american = new AmericanStudent("John", "Doe", 20, gradesAmerican);

        System.out.println(croat.averageGrade());
        System.out.println(german.averageGrade());
        System.out.println(american.averageGrade());
    }
}
