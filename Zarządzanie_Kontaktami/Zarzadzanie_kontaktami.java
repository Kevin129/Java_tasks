package Cwiczenia.Zarządzanie_Kontaktami;

import java.util.ArrayList;
import java.util.Scanner;

public class Zarzadzanie_kontaktami {
    private ArrayList<Contact> contacts; // Lista przechowująca kontakty

    public Zarzadzanie_kontaktami() {
        contacts = new ArrayList<>(); // Inicjalizacja listy kontaktów
    }

    // Dodawanie nowego kontaktu
    public void dodajKontakt(String imie, String nazwisko, String numerTelefonu) {
        Contact nowyKontakt = new Contact(imie, nazwisko, numerTelefonu);
        contacts.add(nowyKontakt);
        System.out.println("Kontakt został dodany.");
    }

    // Wyświetlanie wszystkich kontaktów
    public void wyswietlKontakty() {
        if (contacts.isEmpty()) {
            System.out.println("Brak kontaktów.");
        } else {
            System.out.println("Lista kontaktów:");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }

    // Usuwanie kontaktu na podstawie numeru telefonu
    public void usunKontakt(String numerTelefonu) {
        boolean removed = false;
        for (Contact contact : contacts) {
            if (contact.getNumerTelefonu().equals(numerTelefonu)) {
                contacts.remove(contact);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Kontakt został usunięty.");
        } else {
            System.out.println("Nie znaleziono kontaktu o podanym numerze telefonu.");
        }
    }

    public static void main(String[] args) {
        Zarzadzanie_kontaktami zarzadzanieKontaktami = new Zarzadzanie_kontaktami();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nWybierz opcję:");
            System.out.println("1. Dodaj nowy kontakt");
            System.out.println("2. Wyświetl wszystkie kontakty");
            System.out.println("3. Usuń kontakt");
            System.out.println("4. Wyjdź");

            System.out.print("Twój wybór: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Konsumowanie znaku nowej linii

            switch (choice) {
                case 1:
                    System.out.print("Podaj imię: ");
                    String imie = scanner.nextLine();
                    System.out.print("Podaj nazwisko: ");
                    String nazwisko = scanner.nextLine();
                    System.out.print("Podaj numer telefonu: ");
                    String numerTelefonu = scanner.nextLine();
                    zarzadzanieKontaktami.dodajKontakt(imie, nazwisko, numerTelefonu);
                    break;
                case 2:
                    zarzadzanieKontaktami.wyswietlKontakty();
                    break;
                case 3:
                    System.out.print("Podaj numer telefonu kontaktu do usunięcia: ");
                    String numerTelefonuDoUsuniecia = scanner.nextLine();
                    zarzadzanieKontaktami.usunKontakt(numerTelefonuDoUsuniecia);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Dziękujemy za skorzystanie z programu!");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Wybierz opcję od 1 do 4.");
            }
        }

        scanner.close();
    }
}
