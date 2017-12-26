package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    private static Map<String, Boolean> airport = createMap();

    private static Map<String, Boolean> createMap() {
        Map<String, Boolean> result = new HashMap<>();
        result.put("Warszawa", true);
        result.put("Katowice", true);
        result.put("Krakow", false);
        result.put("Wroclaw", false);
        return result;
    }

    public static void findFlight(Flight flight) throws RouteNotFoundException {

        if (!airport.containsKey(flight.getArrivalAirport()) || !airport.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        } else {
            if (airport.get(flight.getDepartureAirport()) && airport.get(flight.getArrivalAirport())) {
                System.out.println("To polaczenie jest realizowane - prosze zarezerwowac bilet !");
            } else {
                System.out.println("Przykro nam ale wybrane polaczenie nie jest realizowane.");
            }
        }
    }
}
