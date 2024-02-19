package hr.fer.oop.auditorne.rekapitulacija2.ntuple;

import java.util.function.Function;

public class DistanceFromOrigin implements Function<Pair<? extends Number>, Double> {

    @Override
    public Double apply(Pair<? extends Number> pair) {
        double x = pair.getX().doubleValue();
        double y = pair.getY().doubleValue();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
