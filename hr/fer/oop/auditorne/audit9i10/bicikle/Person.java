package hr.fer.oop.auditorne.audit9i10.bicikle;

import org.jetbrains.annotations.NotNull;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private String oib;
    private String name;
    private String surname;
    private int age;
    private String status;

    public Person(String oib, String name, String surname, int age, String status) {
        this.oib = oib;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.status = status;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Person{" +
                "oib='" + oib + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(oib, person.oib);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oib);
    }

    private static Comparator<Object> hrComparator = Collator.getInstance(Locale.forLanguageTag("hr"));

    @Override
    public int compareTo(@NotNull Person other) {
        //compare by surnames, and then by names
        int surnameCompare = hrComparator.compare(this.surname, other.surname);
        if (surnameCompare != 0) {
            return surnameCompare;
        }
        int nameCompare = hrComparator.compare(this.name, other.name);
        if (nameCompare != 0) {
            return nameCompare;
        }
        return oib.compareTo(other.oib);
    }
}
