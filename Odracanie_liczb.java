package Cwiczenia;

public class Odracanie_liczb {
    public static void main(String[] args) {

        //Tablica liczb
        int[] liczby = new int[]{1, 2, 3, 4, 5};

        // Wypisanie liczb od końca
        for (int i = liczby.length-1; i>= 0; i--){
            System.out.println(liczby[i]);
        }
    }
}

