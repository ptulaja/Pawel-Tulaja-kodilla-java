package com.kodilla.rps;

import java.util.Scanner;

public class PersonPlayer implements RpsPlayer {

    private final Scanner scanner ;

    public PersonPlayer(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String play() {
        System.out.println("WYBIERZ 1 - Kamien, 2 - Papier, 3 - Noz");
        int choice = this.scanner.nextInt();
        return RpsPlayer.OPTIONS[choice - 1];

    }
}
