package com.kodilla.testing.calulator;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int resultAdd = calculator.addAToB(5,5);
        System.out.println("Wynik dodawania: " + resultAdd + "\n");

        int resultSub = calculator.substractAFromB(6,5);
        System.out.println("Wynik odjemiwania: " + resultSub + "\n");

        System.out.println("\n___Test dodawanie nr 1___\n");

        if (resultAdd == 10) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("\n___Test odejmowanie nr 1___\n");

        if (resultAdd == 2) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
