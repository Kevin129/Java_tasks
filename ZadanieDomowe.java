package Cwiczenia;

public class ZadanieDomowe {
    public static void main(String[] args) {

        //zakres liczb 0-100, podzielnych przez trzy
        for (int i=0; i<100; i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
