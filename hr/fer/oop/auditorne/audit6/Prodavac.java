package hr.fer.oop.auditorne.audit6;

public class Prodavac {
    public static void zabiljezi(String zapis)
    {
        try{
            String[] elementi = zapis.split(",");
            double[] podaci = new double[3];
            for (int i = 0; i < podaci.length; i++) {
                podaci[i] = Double.parseDouble(elementi[i]);
            }
            double cijena = (podaci[0] - podaci[2]) / podaci[1];
            if (cijena < 0)
                throw new IllegalArgumentException("Majmune ne moze cijena bit negativna!");
            System.out.println("Jedinicna cijena artikla je " + cijena);
        }
        catch(NullPointerException | ArrayIndexOutOfBoundsException | IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Prodavac.zabiljezi("-12345.45,4,0.12");
        Prodavac.zabiljezi(null);
        Prodavac.zabiljezi("321lol.32, 53, 32");
    }
}
