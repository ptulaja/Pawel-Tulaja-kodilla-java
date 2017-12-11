package com.kodilla.testing.forum.statistic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CaluclateAdvStatisticsTestSuite {

    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\nTEST #" + testCounter + "\n");
    }

    public Statistics testMock(int userQuantity, int postQuantity, int commentsQuantity) {

        Statistics statisticsMock = mock(Statistics.class);

        List<Integer> usersList = new ArrayList<Integer>();

        for (int i = 0; i < userQuantity; i++) {
            Integer name = i;
            usersList.add(name);
        }

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        return statisticsMock;
    }


    @Test
    public void test1() {

        //Given
        StatisticsForum statisticsForum = new StatisticsForum();

        //When
        statisticsForum.calculateAdvStatistics(testMock(10, 0, 0));

        //Then
        Assert.assertEquals(0, statisticsForum.getAvgPostsUser(), 0.01);
    }

    @Test
    public void test2() {

        //Given
        StatisticsForum statisticsForum = new StatisticsForum();

        //When
        statisticsForum.calculateAdvStatistics(testMock(10, 1000, 0));

        //Then
        Assert.assertEquals(100, statisticsForum.getAvgPostsUser(), 0.01);
    }

    @Test
    public void test3() {

        //Given
        StatisticsForum statisticsForum = new StatisticsForum();

        //When
        statisticsForum.calculateAdvStatistics(testMock(10, 1, 0));

        //Then
        Assert.assertEquals(0.1, statisticsForum.getAvgPostsUser(), 0.01);
    }

    @Test
    public void test4() {

        //Given
        StatisticsForum statisticsForum = new StatisticsForum();

        //When
        statisticsForum.calculateAdvStatistics(testMock(10, 10, 5));

        //Then
        Assert.assertEquals(0.5, statisticsForum.getAvgCommentsPost(), 0.01);
    }

    @Test
    public void test5() {

        //Given
        StatisticsForum statisticsForum = new StatisticsForum();

        //When
        statisticsForum.calculateAdvStatistics(testMock(10, 5, 10));

        //Then
        Assert.assertEquals(1.0, statisticsForum.getAvgCommentsUser(), 0.01);
    }

    @Test
    public void test6() {

        //Given
        StatisticsForum statisticsForum = new StatisticsForum();

        //When
        statisticsForum.calculateAdvStatistics(testMock(0, 0, 0));

        //Then
        Assert.assertEquals(0.0, statisticsForum.getAvgCommentsPost(), 0.01);
    }

    @Test
    public void test7() {

        //Given
        StatisticsForum statisticsForum = new StatisticsForum();

        //When
        statisticsForum.calculateAdvStatistics(testMock(100, 100, 100));

        //Then
        Assert.assertEquals(1.0, statisticsForum.getAvgCommentsPost(), 0.01);
    }
}