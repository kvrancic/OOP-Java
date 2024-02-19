package hr.fer.oop.vjezbe.vjezba3;

public class Main {
    public static void main(String[] args) {
        FoodType banana = new FoodType("banana", 4, 93, 3);
        Food oneBanana = new Food(banana, 110);
        FoodType grapes = new FoodType("grapes", 4, 94, 2);
        Food grapeCluster = new Food(grapes, 151);
        Meal fruitSalad = new Meal(oneBanana, grapeCluster);
        System.out.println("* original meal:");
        fruitSalad.printIngredients();
        System.out.println("* new meal:");
        Meal doubleFruitSalad = new Meal(fruitSalad, 522);
        doubleFruitSalad.printIngredients();
        }
    }
