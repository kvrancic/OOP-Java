package hr.fer.oop.labosi.lab2priprema.teorija.constructorinheritancePR;

public class R extends P{
    private int b;
    //GREŠKA JE U TOME ŠTA JE OVAJ KONSTRUKTOR PRIVATAN PA GA R NE VIDI
    //public R(){
    //}
    public R(int a) {
        this(a, 5);
    }
    public R(int a, int b){
        super(a);
        this.b = b;
    }


    public static void main(String[] args) {
        System.out.println("laveeeee");
    }
}


