package hr.fer.oop.auditorne.rekapitulacija2.ntuple;

public class Pair<T extends Comparable<T>> extends Ntuple<T>{
    public Pair(T x, T y) {
        super(x, y);
    }

    public T getX() {
        return get(1);
    }

    public void setX(T x) {
        set(1, x);
    }

    public T getY() {
        return get(2);
    }

    public void setY(T y) {
        set(2, y);
    }


}
