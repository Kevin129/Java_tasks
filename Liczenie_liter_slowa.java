package Cwiczenia;
import java.util.HashMap;
import java.util.Map;

public class Liczenie_liter_slowa {
    public static void main(String[] args) {
        String word = "Samochód";
        Map<Character, Long> letterCount = word.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .map(Character::toLowerCase)
                .collect(HashMap::new, (map, c) -> map.merge(c, 1L, Long::sum), HashMap::putAll);

        System.out.println("Liczba wystąpień poszczególnych liter:");
        letterCount.forEach((letter, count) -> System.out.println(letter + ": " + count));
    }
}
