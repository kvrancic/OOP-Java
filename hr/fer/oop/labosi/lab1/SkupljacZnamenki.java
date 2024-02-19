package hr.fer.oop.labosi.lab1;

public class SkupljacZnamenki {
    public static String digitsCollector(String[] input)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length; i++)
        {
            for(int j = 0; j < input[i].length(); j++)
            {
                if (input[i].charAt(j) >= '0' && input[i].charAt(j) <= '9')
                {
                    sb.append(input[i].charAt(j));
                }
            }
        }
        return sb.toString();
    }
}
