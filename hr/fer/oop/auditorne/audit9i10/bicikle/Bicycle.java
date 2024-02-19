package hr.fer.oop.auditorne.audit9i10.bicikle;

import java.util.Comparator;
import java.util.Objects;

public class Bicycle {
    private String brand;
    private int price;
    private Person owner;

    public Bicycle(String brand, int price, Person owner) {
        this.brand = brand;
        this.price = price;
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return price == bicycle.price && Objects.equals(brand, bicycle.brand) && Objects.equals(owner, bicycle.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, owner);
    }

    public static final Comparator<Bicycle> BY_BRAND = (a, b) -> a.brand.compareTo(b.brand);
    public static final Comparator<Bicycle> BY_PRICE = (a, b) -> a.price - b.price;
    public static final Comparator<Bicycle> BY_OWNER = (a, b) -> a.owner.compareTo(b.owner);

}
