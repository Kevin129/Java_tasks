package Cwiczenia;

public class Odwracanie_słowa {
    public static void main(String[] args) {
        String word = "Samochód";

        String reverseWord = new StringBuilder(word).reverse().toString();
        System.out.println(word);
        System.out.println(reverseWord);
    }
}
