package hr.fer.oop.labosi.samostalnilabos2;

class Student {
    private String name, surname;
    private int age;
    public Student(String name, String surname, int age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    static void sortStudentsOnAge(Student[] students) {
        int n = students.length;
        Student temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (students[j - 1].getAge() > students[j].getAge()) {
                    //swap elements
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }

            }
        }
    }
}
