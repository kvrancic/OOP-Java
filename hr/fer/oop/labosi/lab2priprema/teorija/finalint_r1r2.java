package hr.fer.oop.labosi.lab2priprema.teorija;

public class finalint_r1r2 {
    final int x = 0;
    public finalint_r1r2(int x){
        //this.x = x;
    }

    public static void main(String[] args) {
        finalint_r1r2 r1 = new finalint_r1r2(1);
        finalint_r1r2 r2 = new finalint_r1r2(2);
        System.out.println(r1.x);
        System.out.println(r2.x);
    }
}
