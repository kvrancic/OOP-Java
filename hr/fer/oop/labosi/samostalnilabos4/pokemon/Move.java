package hr.fer.oop.labosi.samostalnilabos4.pokemon;



public class Move implements Comparable<Move> {
    private String name;
    private int power;

    public Move(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public int compareTo(Move o) {
        if(power > o.power) return -1;
        else if(power < o.power) return 1;
        else return 0;
    }
}
