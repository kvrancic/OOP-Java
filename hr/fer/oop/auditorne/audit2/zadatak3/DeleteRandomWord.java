package hr.fer.oop.auditorne.audit2.zadatak3;

import java.util.Scanner;

public class DeleteRandomWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucitajte recenicu teksta: ");
        String text = scanner.nextLine();

        String[] words = text.split(" ");
        int randomnumber = (int) (Math.random() * words.length);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++)
            if(i != randomnumber)
                sb.append(words[i]).append(" ");

        String NewText = sb.toString();
        System.out.println(NewText);

        scanner.close();
    }
}
