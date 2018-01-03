package com.kodilla.rps;

import java.util.Scanner;

public class SelectionMenu {

    public static boolean playAgain(Scanner scanner) {
        System.out.println("\nZaczynamy gre ? (n) - tak, (x) - nie ?");
        switch (scanner.next()){
            case "n":
                return areYouSure(scanner);
            case "x" :
                return !areYouSure(scanner);
            default:
                System.out.println("Niewlasciwy wybor!");
                break;
        }
        return false;
    }

    public static boolean areYouSure(Scanner scanner){
        System.out.println("\nJestes pewny (y) - tak, (n) - nie ?");
        switch (scanner.next()){
            case "y" :
                return true;
            case "n":
                return false;
            default:
                System.out.println("Niewlasciwy wybor!");
        }
        return false;
    }
}
