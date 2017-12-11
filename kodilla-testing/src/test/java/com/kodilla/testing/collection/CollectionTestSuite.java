package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("__________TEST__________ \n");
        System.out.println("\nStatus testu: ROZPOCZETY \n");
    }

    @After
    public void after() {
        System.out.println("\nStatus testu: ZAKONCZONY \n");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing" + listNumbers);

        Assert.assertEquals(emptyList, listNumbers);
    }

    @Test
    public void testOddNumbersExterminatorNotEmptyList() {

        ArrayList<Integer> emptyList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing" + listNumbers);

        Assert.assertEquals(emptyList, listNumbers);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> oddList = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10));


        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing" + listNumbers);

        Assert.assertEquals(oddList, listNumbers);
    }

    @Test
    public void testOddNumbersExterminatorNotNormalList() {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> oddList = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));


        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing" + listNumbers);

        Assert.assertEquals(oddList, listNumbers);
    }
}
