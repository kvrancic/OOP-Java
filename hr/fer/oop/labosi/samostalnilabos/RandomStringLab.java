package hr.fer.oop.labosi.samostalnilabos;

import static java.lang.Math.random;

public class RandomStringLab {
    public static String stringFloss(String[] elements)
    {
        StringBuilder sb = new StringBuilder();
        int MaxLength = 0;
        for(int i = 0; i < elements.length; i++)
        {
            if(elements[i].length() > MaxLength)
                MaxLength = elements[i].length();
        }

        for(int i = 0; i < MaxLength; i++)
        {
            for(int j = 0; j < elements.length; j++)
            {
                if(!elements[j].equals(""))
                {
                    int RandomIndex = (int)(random() * elements[j].length());
                    sb.append(elements[j].charAt(RandomIndex));
                    String temp1 = elements[j].substring(0, RandomIndex);
                    String temp2 = elements[j].substring(RandomIndex + 1);
                    elements[j] = temp1 + temp2;
                }


            }
        }
        return sb.toString();

    }
}