package Cwiczenia;

import java.util.Scanner;

public class Fibonacci {
    public static long fibo(int n){
        if (n <= 1)
            return n;
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {

        System.out.println(fibo(6));
        System.out.println(fibo(8));
    }
}