package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Warszawa", "Modlin");

        try {
            FlightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Wybrane lotnisko nie istnieje.");
        } finally {
            System.out.println("\n ---> Polskie Linie Lotnicze LOT <---");
        }
    }
}
