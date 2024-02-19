package hr.fer.oop.vjezbe.vjezba6;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {

    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    private static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }

    public Fraction add(Fraction fraction) {
        Fraction newFraction = new Fraction();
        newFraction.denominator = fraction.denominator * this.denominator;
        newFraction.numerator = fraction.numerator * this.denominator + this.numerator * fraction.denominator;
        newFraction.simplify();
        return newFraction;
    }

    public Fraction subtract(Fraction fraction) {
        Fraction newFraction = new Fraction();
        newFraction.denominator = fraction.denominator * this.denominator;
        newFraction.numerator = fraction.numerator * this.denominator - this.numerator * fraction.denominator;
        newFraction.simplify();
        return newFraction;
    }


    public Fraction multiply(Fraction fraction) {
        Fraction newFraction = new Fraction();
        newFraction.denominator = fraction.denominator * this.denominator;
        newFraction.numerator = fraction.numerator * this.numerator;
        newFraction.simplify();
        return newFraction;
    }

    public Fraction divide(Fraction fraction) {
        Fraction newFraction = new Fraction();
        Fraction invertedFraction = new Fraction();
        invertedFraction = fraction.invert();
        newFraction.denominator = invertedFraction.denominator * this.denominator;
        newFraction.numerator = invertedFraction.numerator * this.numerator;
        newFraction.simplify();
        return newFraction;
    }


    public Fraction invert() {
        Fraction newFraction = new Fraction(denominator, numerator);
        //put minus before numerator
        if (newFraction.denominator < 0) {
            newFraction.denominator = -newFraction.denominator;
            newFraction.numerator = -newFraction.numerator;
        }
        return newFraction;
    }

    public Fraction negate() {
        return new Fraction(-numerator, denominator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}


