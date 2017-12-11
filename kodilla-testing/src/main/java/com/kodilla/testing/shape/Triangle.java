package com.kodilla.testing.shape;

public class Triangle implements Shape {

    public String shapeName;
    public double field;

    public Triangle(double basisLenght, double heighest) {
        this.shapeName = "TRIANGLE";
        this.field = 0.5 * heighest * basisLenght;
    }

    public String getShapeName() {

        return this.shapeName;
    }

    public double getField() {

        return this.field;
    }

    @Override
    public String toString() {

        return "Pole powierzchni trojkata wynosi: " + field;
    }
}
