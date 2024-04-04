package Cwiczenia.Konstruktor;

public class Auto {

    public String marka;
    public String model;
    public Integer rok;
    public Integer przebieg;

    public Auto(){

    }
    // Konstruktor
    public Auto(String marka, String model, int rok, int przebieg){
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
    }

    //Metody
    public void jedz(){
        System.out.println("Jedź!");
    }
    public void hamuj(){
        System.out.println("Hamuj");
    }
    public void info(){
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rok);
        System.out.println("Przebieg: " + przebieg);
    }
}
