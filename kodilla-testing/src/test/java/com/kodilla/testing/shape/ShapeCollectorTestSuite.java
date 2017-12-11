package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("______TESTOWANIE OPROGRAMOWANIA______\n");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("\n______TESTY ZOSTALY ZAKONCZONE______\n");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\nTEST #" + testCounter + "\n");
    }

    @Test
    public void addFigure() {

        //Given
        ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(new Square(10))));
        ShapeCollector expectedList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(new Square(10), new Square(5))));
        int expectedListSize = expectedList.getShapeList().size();

        //When
        testList.addFigure(new Square(5));
        int actualListSize = testList.getShapeList().size();

        //Then
        Assert.assertEquals(expectedListSize, actualListSize);
    }
    @Test
    public void removeFigure() {

        //Given
        Circle circle = new Circle(10);
        Square square = new Square(10);

        ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, square)));

        ShapeCollector expectedList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                circle)));

        int expectedListSize = expectedList.getShapeList().size();

        //When
        testList.removeFigure(square);
        int actualListSize = testList.getShapeList().size();

        //Then
        Assert.assertEquals(expectedListSize, actualListSize);

    }

    @Test
    public void getFigure() {

        //Given
        Triangle triangle = new Triangle(10, 15);
        Square square = new Square(10);
        Circle circle = new Circle(10);

        ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(triangle, square, circle)));

        //When
        Shape shape1=testList.getFigure(0);
        Shape shape2=testList.getFigure(1);
        Shape shape3=testList.getFigure(2);

        //Then
        Assert.assertEquals(triangle, shape1);
        Assert.assertEquals(square, shape2);
        Assert.assertEquals(circle, shape3);
    }
}
