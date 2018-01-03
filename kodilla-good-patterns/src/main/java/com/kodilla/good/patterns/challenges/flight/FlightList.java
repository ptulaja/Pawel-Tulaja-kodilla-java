package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    private final List<ConnectedFlight> connectedFlights = new ArrayList<>();

    public FlightList() {
        connectedFlights.add(new ConnectedFlight("Warszawa", "Wroclaw", "Lot realizowany bez miedzyladowania"));
        connectedFlights.add(new ConnectedFlight("Warszawa", "Krakow", "Lot realizowany bez miedzyladowania"));
        connectedFlights.add(new ConnectedFlight("Wroclaw", "Warszawa", "Lot realizowany bez miedzyladowania"));
        connectedFlights.add(new ConnectedFlight("Wroclaw", "Krakow", "Lot realizowany bez miedzyladowania"));
        connectedFlights.add(new ConnectedFlight("Krakow", "Warszawa", "Lot realizowany bez miedzyladowania"));
        connectedFlights.add(new ConnectedFlight("Krakow", "Wroclaw", "Lot realizowany bez miedzyladowania"));
        connectedFlights.add(new ConnectedFlight("Wroclaw", "Krakow", "Warszawa"));
        connectedFlights.add(new ConnectedFlight("Krakow", "Warszawa", "Wroclaw"));
        connectedFlights.add(new ConnectedFlight("Krakow", "Wroclaw", "Warszawa"));
    }

    public List<ConnectedFlight> getList() {
        return new ArrayList<>(connectedFlights);
    }
}
