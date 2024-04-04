package Cwiczenia;

import java.util.Scanner;

public class Pobieranie_danych {
    public static void main(String[] args) {

        System.out.println("Podaj imię: ");
        Scanner getName = new Scanner(System.in);
        String name = getName.nextLine();

        System.out.println("Witaj: " + name);
    }
}
