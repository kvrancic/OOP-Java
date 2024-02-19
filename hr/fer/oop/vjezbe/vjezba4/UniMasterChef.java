package hr.fer.oop.vjezbe.vjezba4;

public class UniMasterChef {
    CompetitionEntry[] entries;
    int index = 0;

    public UniMasterChef(int numberOfEntries) {
        this.entries = new CompetitionEntry[numberOfEntries];
    }

    public boolean addEntry(CompetitionEntry entry) {
        if(index == this.entries.length)
            return false;
        for(CompetitionEntry e : entries) {
            if(e != null && e.equals(entry))
                return false;
        }
        entries[index] = entry;
        index++;
        return true;
    }

    public Dessert getBestDessert()
    {
        double maxrating = entries[0].getRating();
        int maxindex = 0;
        if(index == 0)
            return null;
        for(int i = 0; i < index; i++)
        {
            if(entries[i].getRating() > maxrating)
            {
                maxindex = i;
                maxrating = entries[i].getRating();
            }
        }
        return entries[maxindex].getDessert();
    }

    public static Person[] getInvolvedPeople(CompetitionEntry entry)
    {
        Person[] peopleInvolved = new Person[4];
        int index = 0;
        peopleInvolved[index++] = entry.getTeacher();
        for(Student s: entry.getStudents())
        {
            peopleInvolved[index++] = s;
        }
        return peopleInvolved;
    }

    public static void main(String[] args) {

        Dessert genericDessert = new Dessert("Chocolate Mousse", 120, 300);
        Cake cake = new Cake("Raspberry chocolate cake #3", 350.5, 400, false, "birthday");

        Teacher t1 = new Teacher("Dario", "Tušek", 42, "dario.tusek@fer.hr", "OOP", 10000);
        Teacher t2 = new Teacher("Doris", "Bezmalinović", 43, "doris.bezmalinovic@fer.hr", "OOP", 10000);

        Student s1 = new Student("Janko", "Horvat", 18, "0036312123", (short)1);
        Student s2  = new Student("Ana", "Kovač", 19, "0036387656", (short)2);
        Student s3  = new Student("Ivana", "Stanić", 19, "0036392357", (short)1);

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
