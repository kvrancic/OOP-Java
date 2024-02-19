package hr.fer.oop.labosi.lab2priprema.teorija.constructorR35;

public class R {
    public double x;
    public double y;

    public R() {
        //OVO TREBA UPISATI
        this(3,5);
    }

    public R(int x){
        //U DRUGOM ZADATKU CE OVO BIT GREKSKA JER THIS MORA BIT PRVI
        y = 3;
        //this(x,x);
    }

    public R(int x, int y)
    {
        this((double)x, (double)y);
    }

    public R(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
}
