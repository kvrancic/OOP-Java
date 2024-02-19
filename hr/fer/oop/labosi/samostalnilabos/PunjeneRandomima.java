package hr.fer.oop.labosi.samostalnilabos;

public class PunjeneRandomima {
    static void fillRandomly(int [] dest, int [] src)
    {
        if(!(src.length==0 && dest.length==0))
        {
            for(int i = 0; i < dest.length; i++)
            {
                dest[i] = src[(int)(Math.random() * src.length)];
            }
        }
    }
}
