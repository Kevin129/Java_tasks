package Cwiczenia;

import java.util.Scanner;

public class Wybor_Programu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Wybierz funkcje 1-3: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    firstProgram();
                    break;
                case 2:
                    secondProgram();
                    break;
                case 3:
                    thirdProgram();
                    break;
                default:
                    System.out.println("Nie ma takiego programu");
            }

            // Zapytaj użytkownika, czy chce kontynuować
            System.out.print("Czy chcesz kontynuować? (T/N): ");
            String decision = scanner.next().toUpperCase();
            if (!decision.equals("T")) {
                exit = true; // Ustaw wartość exit na true, aby wyjść z pętli
                System.out.println("\nDziękujemy za skorzystanie z programu!");
            }
        }

        scanner.close();
    }

    private static void firstProgram() {
        System.out.println("To jest program nr 1");
    }

    private static void secondProgram() {
        System.out.println("To jest drugi program");
    }

    private static void thirdProgram() {
        System.out.println("To jest trzeci program");
    }
}
