package hr.fer.oop.labosi.lab2priprema.teorija;

interface I1 {}
class C1 implements I1 {}
public class abI1C1 {
    public static void main(String[] args) {
        I1 a = new C1();
        C1 b = new C1();
       // b = a;
        a = b;
        //        a = new I1();
    }
}
