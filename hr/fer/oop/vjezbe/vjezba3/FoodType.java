package hr.fer.oop.vjezbe.vjezba3;

public class FoodType {
    private String name;
    private int protein, carbs, fat;
    static int counter = 0;

    public String toString(){
        return name + ": p - " + protein + "%, c - " + carbs + "%, f - " + fat + "%";
    }

    public static int getNumberOfCreatedInstances(){
        return counter;
    }

    public FoodType(String name, int protein, int carbs, int fat) {
        this.name = name;
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }
}
