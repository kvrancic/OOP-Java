package hr.fer.oop.vjezbe.vjezba3;

public class Food {
    private FoodType type;
    private int weight;

    public Food(FoodType type, int weight) {
        this.type = type;
        this.weight = weight;
    }


    public FoodType getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s, w - %d", type.toString(), weight);
    }

    public double getProtein()
    {
        return (double)type.getProtein()/100.0 * getWeight();
    }
    public double getCarbs()
    {
        return (double)type.getCarbs()/100.0 * getWeight();
    }
    public double getFat()
    {
        return (double)type.getFat()/100.0 * getWeight();
    }

    public String toStringInGrams() {
        return String.format("%s: p - %.1fg, c - %.1fg, f - %.1fg, w - %dg", type.getName(), getProtein(),
                getCarbs(), getFat(), weight);
    }


}
