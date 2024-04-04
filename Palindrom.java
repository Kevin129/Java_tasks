package Cwiczenia;

import java.util.Scanner;

// Palindrom to wyraz, który cztany od przodu i od tyłu brzmi tak samo np: Kajak
public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj słowo: ");
        String word = scanner.nextLine();

        if(word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println(word + " jest palindromem.");
        } else {
            System.out.println(word + " nie jest palindromem.");
        }
    }
}
