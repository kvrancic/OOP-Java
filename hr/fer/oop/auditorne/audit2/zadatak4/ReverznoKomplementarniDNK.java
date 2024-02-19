package hr.fer.oop.auditorne.audit2.zadatak4;

public class ReverznoKomplementarniDNK {
    public static void main(String[] args) {
        String sequence = args[0];
        System.out.println("Your DNA sequence is: " + sequence);
        sequence = reverse(sequence);
        System.out.println("Your reversed DNA sequence is: " + sequence);
        sequence = complement(sequence);
        System.out.println("Your complemented and reversed DNA sequence is: " + sequence);
    }

    public static String reverse(String sequence)
    {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(int i = sequence.length() - 1; i >= 0; i--)
        {
            sb.append(sequence.charAt(i));
        }
        return sb.toString();
    }

    public static String complement(String sequence)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sequence.length(); i++)
        {
            if(sequence.charAt(i) == 'A') {
                sb.append('T');
            }
            else if (sequence.charAt(i) == 'T')
            {
                sb.append('A');
            }
            else if (sequence.charAt(i) == 'G')
            {
                sb.append('C');
            }
            else if (sequence.charAt(i) == 'C')
            {
                sb.append('G');
            }
            else
                sb.append(" ");
        }

        return sb.toString();
    }

}
