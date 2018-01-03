package com.kodilla.good.patterns.challenges.flight;

public class FlightRunner {
    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();

        flightSearcher.startPoint("Warszawa");
        flightSearcher.startPoint("Wroclaw");
        flightSearcher.startPoint("Krakow");
        flightSearcher.endPoint("Warszawa");
        flightSearcher.endPoint("Wroclaw");
        flightSearcher.endPoint("Krakow");
        flightSearcher.connectionPoint("Wroclaw");
        flightSearcher.connectionPoint("Krakow");
        flightSearcher.connectionPoint("Warszawa");
    }
}
