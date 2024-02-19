package hr.fer.oop.labosi.samostalnilabos5.fruit;

import java.util.Objects;

class Fruit {

    private final String name;
    private final FruitColor color;

    public Fruit(String name, FruitColor color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public FruitColor getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name) &&
                color == fruit.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Fruit{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
