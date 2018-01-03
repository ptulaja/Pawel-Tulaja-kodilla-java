package com.kodilla.good.patterns.challenges.flight;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {

    private final FlightList flightsTable = new FlightList();

    public List<ConnectedFlight> startPoint(String startPoint) {
        List<ConnectedFlight> connectedFlight = flightsTable.getList().stream()
                .filter(flights -> flights.getStartPoint().equals(startPoint))
                .collect(Collectors.toList());
        System.out.println("\nTrwa wyszukiwanie lotu z lotniska: " + startPoint + "\n");
        connectedFlight.stream()
                .forEach(System.out::println);
        return connectedFlight;
    }

    public List<ConnectedFlight> endPoint(String endPoint) {
        List<ConnectedFlight> connectedFlight = flightsTable.getList().stream()
                .filter(flights -> flights.getEndPoint() == endPoint)
                .collect(Collectors.toList());
        System.out.println("\nTrwa wyszukiwanie lotu do lotniska: " + endPoint + "\n");
        connectedFlight.stream()
                .forEach(System.out::println);
        return connectedFlight;
    }

    public List<ConnectedFlight> connectionPoint(String connectionPoint) {
        List<ConnectedFlight> connectedFlight = flightsTable.getList().stream()
                .filter(flights -> flights.getConnectPoint() == connectionPoint)
                .collect(Collectors.toList());
        System.out.println("\nTrwa wyszukiwanie lotu z miedzyladowaniem na lotnisku: " + connectionPoint + "\n");
        connectedFlight.stream()
                .forEach(System.out::println);
        return connectedFlight;
    }
}
