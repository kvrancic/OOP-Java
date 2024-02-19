package hr.fer.oop.vjezbe.vjezba4;

public class Main {
    public static void main(String[] args) {
        int netsalary = 0;
        int numberofteachers = 0;
        Person[] persons = new Person[5];
        persons[0] = new Teacher("Natalija", "Hobar", 56, "natalija@hobar.hr", "Kemija", 9000);
        persons[1] = new Teacher("Sanja", "Magazin", 55, "sanja@magazin.hr", "Glazbeni", 3246);
        persons[2] = new Teacher("Mila", "Kundajica", 41, "mila@kundajica.com", "Hrvacki", 650);
        persons[3] = new Student("Antea", "Mihaljević", 19, "am3456", (short) 202);
        persons[4] = new Student("Karlo", "Vrančić", 19, "kv54199", (short) 2022);

        for(Person person: persons)
        {
            System.out.println(person.getName() + " " + person.getSurname());
            if(person instanceof Teacher teacher)
            {
                netsalary += teacher.getSalary();
                numberofteachers++;
            }
        }

        System.out.println("Average salary is " + (double)netsalary/numberofteachers);

        Person p1 = new Person("Ivo","Ivic", 20);
        Person p2 = new Person("Ivo","Ivic", 20);
        Person p3 = new Student("Ivo","Ivic", 20, "0036312123", (short)3);
        Person p4 = new Student("Marko","Maric", 25, "0036312123", (short)5);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p4));

        Dessert genericDessert = new Dessert("Chocolate Mousse", 120, 300);
        Cake cake = new Cake("Raspberry chocolate cake #3", 350.5, 400, false, "birthday");
        Teacher t1 = new Teacher("Dario", "Tušek", 42, "dario.tusek@fer.hr", "OOP", 10000);
        Teacher t2 = new Teacher("Doris", "Bezmalinović", 43, "doris.bezmalinovic@fer.hr", "OOP", 10000);
        Student s1 = new Student("Janko", "Horvat", 18, "0036312123", (short)1);
        Student s2 = new Student("Ana", "Kovač", 19, "0036387656", (short)2);
        Student s3 = new Student("Ivana", "Stanić", 19, "0036392357", (short)1);
        UniMasterChef competition = new UniMasterChef(2);
        CompetitionEntry e1 = new CompetitionEntry(t1, genericDessert);
        competition.addEntry(e1);
        System.out.println("Entry 1 rating: " + e1.getRating());
        e1.addRating(s1, 4);
        e1.addRating(s2, 5);
        System.out.println("Entry 1 rating: " + e1.getRating());
        CompetitionEntry e2 = new CompetitionEntry(t2, cake);
        e2.addRating(s1, 4);
        e2.addRating(s3, 5);
        e2.addRating(s2, 5);
        competition.addEntry(e2);
        System.out.println("Entry 2 rating: " + e2.getRating());
        System.out.println("Best dessert is: " + competition.getBestDessert().getName());
        Person[] e2persons = UniMasterChef.getInvolvedPeople(e2);
        for (Person p : e2persons)
            System.out.println(p);

    }

}
