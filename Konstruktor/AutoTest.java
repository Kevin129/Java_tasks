package Cwiczenia.Konstruktor;

public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto("Mercedes", "Klasa S", 2017, 1000);
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto("Audi", "A3", 2020, 100);
        audi.info();

        Auto bmw = new Auto("BMW", "Seria 2", 2017, 1000);
        bmw.info();


    }
}
