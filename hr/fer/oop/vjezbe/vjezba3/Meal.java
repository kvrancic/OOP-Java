package hr.fer.oop.vjezbe.vjezba3;

public class Meal {
    private Food[] ingredients;

    public Meal(Food...ingredients) {
        this.ingredients = new Food[ingredients.length];
        for (int i = 0; i < ingredients.length; i++) {
            this.ingredients[i] = ingredients[i];
        }
    }

    public void printIngredients(){
        for (int i = 0; i < ingredients.length; i++)
        {
            System.out.printf("Ingredient[%d] = %s%n", i, ingredients[i].toString());
        }
    }
    public int getNumberOfIngredients(){
        return ingredients.length;
    }
    public Food getIngredient(int index)
    {
        return index >= 0 && index < ingredients.length ? ingredients[index] : null;
    }

    public Meal(Meal meal, int weight) {
        this.ingredients = new Food[meal.ingredients.length];

        for (int i = 0; i < ingredients.length; i++) {
            this.ingredients[i] = new Food(meal.ingredients[i].getType(), meal.ingredients[i].getWeight() * weight / meal.getWeight());
        }
    }

    private int getWeight() {
        return 69;
    }


}
