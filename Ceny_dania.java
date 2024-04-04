package Cwiczenia;
import java.util.Scanner;

public class Ceny_dania {

    public static void main(String[] args) {

        System.out.println("Nasze menu: ");
        System.out.println("Pizza");
        System.out.println("Hamburger");
        System.out.println("Frytki");

        System.out.println("Co chcesz kupić? ");

        Scanner getDish = new Scanner(System.in);
        String Dish = getDish.nextLine();

        switch (Dish){
            case "Pizza":
                System.out.println("Cena Pizzy to 32zł");
                break;
            case "Hamburger":
                System.out.println("Cena Hamburgera to 27zł");
                break;
            case "Frytki":
                System.out.println("Cena Frytek to 17zł");
                break;
            default:
                System.out.println("Nie ma takiego dania w naszej ofercie");
        }
    }
}
