package hr.fer.oop.labosi.samostalnilabos5.fruit;

import java.util.function.Predicate;


public class FruitFinder {
    /**
     * Returns a {@link Predicate<Fruit>} instance that will match a fruit by the provided color and
     * check a fruit name contains the given pattern, at any point in the name, case sensitive.
     *
     * @param color   the color to be matched
     * @param pattern the pattern that is to be contained within the name
     * @return the {@link Predicate} instance
     */
    public static Predicate<Fruit> allFruitThatMatchColorAndPattern(
            FruitColor color, String pattern
    ){
        return fruit -> fruit.getColor() == color && fruit.getName().contains(pattern);
    }
    /**
     * Returns a {@link Predicate<Fruit>} instance that will match a fruit if it is not the same
     * color as provided and if the fruits name does not contain the given pattern, at any point in
     * the name, case sensitive.
     *
     * @param color   the color to be excluded
     * @param pattern the pattern that can not be contained within the name
     * @return the {@link Predicate} instance
     */
    public static Predicate<Fruit> allFruitThatDoesNotMatchColorAndDoesNotContainPattern(
            FruitColor color, String pattern
    ){
        return fruit -> fruit.getColor() != color && !fruit.getName().contains(pattern);
    }
}
