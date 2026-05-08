package com.example;

public class Main {

    public static void main(String[] args) {

        double a = 5.0;
        double b = 3.0;

        double terfogat =
                Calculate.terfogatSzamitas(a, b);

        System.out.println(
                "Az orsószferoid térfogata: " + terfogat
        );
    }
}