package hr.fer.oop.auditorne.audit9i10.bicikle;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Loader.loadPerson();
        List<Bicycle> bicycles = Loader.loadBicycle();

        Collections.sort(persons);
        for(Person p : persons) {
            System.out.println(p);
        }

        Set<Bicycle> sortedBycicle = new TreeSet<>(Bicycle.BY_BRAND.thenComparing(Bicycle.BY_OWNER.reversed()).thenComparing(Bicycle.BY_PRICE));
        sortedBycicle.addAll(bicycles);
        for(Bicycle b : sortedBycicle) {
            System.out.println(b);
        }

    }
}