package com.kodilla.rps;

import java.util.Scanner;

public class SelectionNext {

    public static boolean nextRound(Scanner scanner) {
        System.out.println("\nNacisnij (c) zeby kontynuowac...");
        switch (scanner.next()) {
            case "c":
                return true;
            default:
                System.out.println("Niewlasciwy wybor!");
        }
        return false;
    }
}
