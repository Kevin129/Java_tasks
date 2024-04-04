package Cwiczenia.Zarządzanie_Kontaktami;

public class Contact {
    private String imie;
    private String nazwisko;
    private String numerTelefonu;

    public Contact(String imie, String nazwisko, String numerTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerTelefonu = numerTelefonu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    @Override
    public String toString() {
        return "Imię: " + imie + " | Nazwisko: " + nazwisko + " | Numer telefonu: " + numerTelefonu;
    }
}
