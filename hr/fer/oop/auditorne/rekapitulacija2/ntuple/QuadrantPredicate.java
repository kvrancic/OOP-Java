package hr.fer.oop.auditorne.rekapitulacija2.ntuple;

import java.util.Arrays;
import java.util.function.Predicate;

public class QuadrantPredicate implements Predicate<Pair<? extends Number>> {
    private boolean[] quadrantPossibility;

    public QuadrantPredicate(boolean firstGood, boolean secondGood, boolean thirdGood, boolean fourthGood) {
        quadrantPossibility = new boolean[4];
        quadrantPossibility[0] = firstGood;
        quadrantPossibility[1] = secondGood;
        quadrantPossibility[2] = thirdGood;
        quadrantPossibility[3] = fourthGood;
    }

    @Override
    public boolean test(Pair<? extends Number> pair) {
        int quadrant = 0;

        if(pair.getX().doubleValue() > 0 && pair.getY().doubleValue() > 0)
            quadrant = 1;
        if(pair.getX().doubleValue() < 0 && pair.getY().doubleValue() > 0)
            quadrant = 2;
        if(pair.getX().doubleValue() < 0 && pair.getY().doubleValue() < 0)
            quadrant = 3;
        if(pair.getX().doubleValue() > 0 && pair.getY().doubleValue() < 0)
            quadrant = 4;

        return quadrant != 0 && quadrantPossibility[quadrant - 1];
    }

    @Override
    public String toString() {
        return "QuadrantPredicate{" +
                "quadrantPossibility=" + Arrays.toString(quadrantPossibility) +
                '}';
    }
}
