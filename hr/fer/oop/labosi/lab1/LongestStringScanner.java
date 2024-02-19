package hr.fer.oop.labosi.lab1;

import java.util.Scanner;

public class LongestStringScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String longest = "";
        String CurrText;
        do {
            CurrText = scan.nextLine();
            if (CurrText.length() > longest.length()) {
                longest = CurrText;
            }
        } while (!CurrText.equals("KRAJ"));

        System.out.println(longest);

    }
}
