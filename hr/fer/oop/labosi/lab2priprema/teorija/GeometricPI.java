package hr.fer.oop.labosi.lab2priprema.teorija;

interface Geometric{
    double PI = 3.14;
    double getArea();
}

public class GeometricPI {
    public static void main(String[] args) {
        Geometric g1;
        //interfejs ne moze stvarat objekte!!!!!!!!!!!!!!!
        //Geometric g2 = new Geometric();
        Geometric[] gArray1 = new Geometric[10];
        Geometric[] gArray2;
        //Object o1 = new Double(Geometric.PI);
        //Object o2 = new Double(Geometric.getArea());
        //OVO JE TOCNO PAZI Object o = new Double(Geometric.PI);
    }

}
