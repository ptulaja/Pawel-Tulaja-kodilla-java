package com.kodilla.testing.shape;

public class Circle implements Shape {

    public String shapeName;
    public double field;

    public Circle(double radius) {
        this.shapeName = "CIRCLE";
        this.field = 3.14 * radius * radius;
    }

    public String getShapeName() {

        return this.shapeName;
    }

    public double getField() {

        return this.field;
    }

    @Override
    public String toString() {

        return "Pole powierzchni okregu wynosi: " + field;
    }
}
