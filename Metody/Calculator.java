package Cwiczenia.Metody;

public class Calculator {

    public int dodawanie(int firstNumber, int secondNumber) {
        System.out.println("Dodawanie: " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }
    public int odejmowanie(int firstNumber, int secondNumber) {
        System.out.println("Odejmowanie: " + (firstNumber - secondNumber));
        return firstNumber - secondNumber;
    }
    public int dzielenie(int firstNumber, int secondNumber) {
        System.out.println("Dzielenie: " + (firstNumber / secondNumber));
        return firstNumber / secondNumber;
    }
    public int mnozenie(int firstNumber, int secondNumber) {
        System.out.println("Mnożenie: " + (firstNumber * secondNumber));
        return firstNumber * secondNumber;
    }
    public int modulo(int firstNumber, int secondNumber) {
        System.out.println("Modulo: " + (firstNumber % secondNumber));
        return firstNumber % secondNumber;
    }

}
