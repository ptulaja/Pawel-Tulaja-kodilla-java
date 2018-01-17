package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void shoppingFactoryTest() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertFalse(shopping.isTaskExecuted());
        Assert.assertEquals("Zadanie: zakupy, Ilosc: 1.0, Produkt: rower", shopping.executeTask());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void paintingFactoryTest() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);

        //Then
        Assert.assertFalse(painting.isTaskExecuted());
        Assert.assertEquals("Zadanie: malowanie, Kolor: czarny, Malujemy: samochod", painting.executeTask());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void drivingFactoryTest() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);

        //Then
        Assert.assertFalse(driving.isTaskExecuted());
        Assert.assertEquals("Zadanie: jazda, Srodek transportu: autobus, Gdzie: do pracy", driving.executeTask());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
