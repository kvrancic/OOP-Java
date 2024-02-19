package hr.fer.oop.labosi.samostalnilabos;


public class BrojSamoglasnika {
    public static int brojSamoglasnika(String str){
        int counter = 0;
        str = str.toLowerCase();
        str = str.replaceAll("e","a");
        str = str.replaceAll("i","a");
        str = str.replaceAll("o","a");
        str = str.replaceAll("u","a");
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'a')
                counter++;
        }

        return counter;
    }
}
