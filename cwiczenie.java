package Cwiczenia;

import java.util.Scanner;

public class cwiczenie {
    public static void main(String[] args) {

        System.out.println("Co chcesz zjeść, Hamburger czy frytki");

        Scanner getDish = new Scanner(System.in);
        String dish = getDish.nextLine();

        switch (dish){
            case ("Hamburger"):
                System.out.println("Hamburger kosztje 32zł");
                break;
            case ("Frytki"):
                System.out.println("Frytki kosztują 17zł");
                break;
            case ("Pizza"):
                Pizza();
                break;
            default:
                System.out.println("Nie sprzedajemy takiego dania");
        }
    }
    public static void Pizza(){
        System.out.println("Pizza kosztuje 44zł");
    }
}

