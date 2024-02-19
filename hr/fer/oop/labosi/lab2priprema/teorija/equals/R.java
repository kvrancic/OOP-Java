package hr.fer.oop.labosi.lab2priprema.teorija.equals;

public class R {
    public int x;
    public int y;

    public R(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString() {return x + "," + y;}

    public boolean equals(Object o)
    {
        R other = (R)o;
        return this.x == other.x && this.y == other.y;
    }

    public static void main(String[] args) {
        R r1 = new R(2,3);
        R r2 = new R(2,3);
        R r3 = new R(3,2);
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));

    }
}
