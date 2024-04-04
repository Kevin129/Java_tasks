package Cwiczenia;

import java.util.HashMap;
import java.util.Map;

public class Zliczanie_wystapien {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 2, 5, 3};

        // Tworzymy mapę z użyciem Integer jako typu wartości
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Iterujemy po tablicy, zliczając wystąpienia każdej liczby
        for (int number : numbers) {
            occurrences.merge(number, 1, Integer::sum);
        }

        // Wyświetlamy wyniki
        occurrences.forEach((key, value) -> System.out.println("Liczba " + key + " występuje " + value + " razy."));

    }
}
