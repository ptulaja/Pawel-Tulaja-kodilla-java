package com.kodilla.testing.shape;

public class Square implements Shape {

    public String shapeName;
    public double field;

    public Square(double sideLenght) {
        this.shapeName = "SQUARE";
        this.field = sideLenght * sideLenght;
    }

    public String getShapeName() {

        return this.shapeName;
    }

    public double getField() {

        return this.field;
    }

    @Override
    public String toString() {

        return "Pole powierzchni kwadratu wynosi: " + field;
    }
}
