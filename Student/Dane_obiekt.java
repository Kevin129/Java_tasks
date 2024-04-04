package Cwiczenia.Student;

public class Dane_obiekt {
    public static void main(String[] args) {
        Struktura_klasa Tomasz = new Struktura_klasa();
        Tomasz.name = "Tomasz";
        Tomasz.city = "Kraków";
        Tomasz.id = 1;

        Struktura_klasa Kasia = new Struktura_klasa();
        Kasia.name = "Kasia";
        Kasia.city = "Warszawa";
        Kasia.id = 2;

        Struktura_klasa Jan = new Struktura_klasa();
        Jan.name = "Jan";
        Jan.city = "Poznań";
        Jan.id = 3;

        Tomasz.info();
        Kasia.info();
        Jan.info();

    }
}
