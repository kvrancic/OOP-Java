package hr.fer.oop.auditorne.audit9i10.slatkisi;

import java.util.ArrayList;
import java.util.List;

public class SweetCatalogue {
    public static List<Sweet> loadSweets(){
        List <Sweet> listSweet = new ArrayList<>();
        listSweet.add(new Sweet("Cupcake", 1.5, 2.5, 5));
        listSweet.add(new Sweet("IceCream", 3, 5, 4));
        listSweet.add(new Sweet("Candy", 1, 1, 3));
        listSweet.add(new Sweet("Chocolate", 2, 3, 2));
        listSweet.add(new Sweet("Cookie", 1, 1, 1));
        listSweet.add(new Sweet("Cake", 2, 2, 1));
        return listSweet;

    }
}
