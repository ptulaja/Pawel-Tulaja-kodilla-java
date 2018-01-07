package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        RpsPlayer computer = new ComputerPlayer(new Random());
        RpsPlayer human = new PersonPlayer(scanner);

        int humanScore = 0 ;
        int comScore = 0 ;

        String first_name;
        int endingScore;


        System.out.print("Podaj swoje imie: ");
        first_name = scanner.next();

        System.out.print("Ile gier chcesz zagrać: ");
        endingScore = scanner.nextInt();

        while (SelectionMenu.playAgain(scanner)) {
            while (SelectionNext.nextRound(scanner)) {
                String com = computer.play();
                String player = human.play();

                if (player.equals(com)) {
                    System.out.println("REMIS");
                    ScoreTable.checkScore(first_name, humanScore, comScore);

                } else if (("Rock".equals(player) && "Scissors".equals(com)) ||
                        ("Scissors".equals(player) && "Paper".equals(com)) ||
                        ("Paper".equals(player) && "Rock".equals(com))) {
                    System.out.println(first_name + " WYGRALES !");
                    humanScore++;
                    ScoreTable.checkScore(first_name, humanScore, comScore);
                } else {
                     assert  (("Rock".equals(com) && "Scissors".equals(player)) ||
                            ("Scissors".equals(com) && "Paper".equals(player)) ||
                            ("Paper".equals(com) && "Rock".equals(player)));
                    System.out.println(first_name + " PRZEGRALES !");
                    comScore++;
                    ScoreTable.checkScore(first_name, humanScore, comScore);
                }
                if (humanScore == endingScore || comScore == endingScore) {
                    System.out.println("WYNIK KONCOWY!");
                    break;
                }
            }
        }
    }
}
