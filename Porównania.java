package Cwiczenia;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Porównania {
    public static void main(String[] args) {

        //Get first number
        System.out.println("Podaj pierwsza liczbę: ");
        Scanner getFirstNumber = new Scanner(System.in);
        int firstNumber = Integer.parseInt(getFirstNumber.nextLine());

        //Get second number
        System.out.println("Podaj druga liczbę: ");
        Scanner getSecondNumber = new Scanner(System.in);
        int secondNumber = Integer.parseInt(getSecondNumber.nextLine());

        //Results
        System.out.println("Wyniki porównań: ");

        System.out.println("Czy " + firstNumber + " jest większe od " + secondNumber + " ?");
        System.out.println(firstNumber > secondNumber);

        System.out.println("Czy " + firstNumber + " jest mniejsze od " + secondNumber + " ?");
        System.out.println(firstNumber < secondNumber);

        System.out.println("Czy " + firstNumber + " jest większe lub równe " + secondNumber + " ?");
        System.out.println(firstNumber >= secondNumber);

        System.out.println("Czy " + firstNumber + " jest mniejsze lub równe" + secondNumber + " ?");
        System.out.println(firstNumber <= secondNumber);

        System.out.println("Czy " + firstNumber + " jest takie samo" + secondNumber + " ?");
        System.out.println(firstNumber == secondNumber); //Czy są takie same

        System.out.println("Czy " + firstNumber + " jest różne" + secondNumber + " ?");
        System.out.println(firstNumber != secondNumber); //Czy różnią sie od siebie
    }
}
