package com.kodilla.good.patterns.challenges.flight;

public class ConnectedFlight {

    private final String startPoint;
    private final String endPoint;
    private final String connectPoint;

    public ConnectedFlight(String startPoint, String endPoint, String connectPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.connectPoint = connectPoint;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public String getConnectPoint() {
        return connectPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConnectedFlight that = (ConnectedFlight) o;

        if (!startPoint.equals(that.startPoint)) return false;
        if (!endPoint.equals(that.endPoint)) return false;
        return connectPoint.equals(that.connectPoint);
    }

    @Override
    public int hashCode() {
        int result = startPoint.hashCode();
        result = 31 * result + endPoint.hashCode();
        result = 31 * result + connectPoint.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Polaczenie lotnicze -> " +
                "Wylot z lotniska: >>  " + startPoint +
                "  << , Przylot na lotnisko: >>  " + endPoint +
                "  << , Miedzyladowanie: >>  "+ connectPoint + "  <<  <-";
    }
}
