package Cwiczenia;

import java.util.Scanner;


public class Mozesz_kupic_alkohol {
    public static void main(String[] args) {

        System.out.println("Podaj swój wiek: ");

        Scanner getAge = new Scanner(System.in);
        int age = Integer.parseInt(getAge.nextLine());

        if (age >= 18){
            System.out.println("Możesz kupić alkohol");
        }else{
            System.out.println("Nie możesz kupić alkoholu");
        }
    }
}
