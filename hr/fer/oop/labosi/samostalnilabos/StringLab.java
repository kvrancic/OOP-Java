package hr.fer.oop.labosi.samostalnilabos;

import java.time.LocalDate;

public class StringLab {
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
                if(elements[j].length() > i)
                {
                    sb.append(elements[j].charAt(i));
                }


            }
        }
        return sb.toString();

    }
}

