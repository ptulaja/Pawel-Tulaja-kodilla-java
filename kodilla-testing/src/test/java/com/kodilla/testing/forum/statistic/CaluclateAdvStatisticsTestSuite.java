package com.kodilla.testing.forum.statistic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CaluclateAdvStatisticsTestSuite {

    public Statistics initializeStatisticsMock(int userNum, int postNum, int commentsNum) {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<String>();

        for (int i = 0; i < userNum; i++) {
            String name = "Jan";
            name = name + i;
            usersList.add(name);
        }

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postNum);
        when(statisticsMock.commentsCount()).thenReturn(commentsNum);

        return statisticsMock;
    }


    @Test
    public void testCalculateAveragePostUser1() {
        //Given
        StatisticsForum forumStatistics = new StatisticsForum();
        //When
        forumStatistics.calculateAdvStatistics(initializeStatisticsMock(100, 1000, 0));

        Assert.assertEquals(10.00, forumStatistics.getAvgPostsUser(), 0.000001);
    }

    @Test
    public void testCalculateAveragePostUser2() {
        //Given
        StatisticsForum forumStatistics = new StatisticsForum();
        //When
        forumStatistics.calculateAdvStatistics(initializeStatisticsMock(0, 1000, 0));

        Assert.assertEquals(-1, forumStatistics.getAvgPostsUser(), 0.000001);
    }

    @Test
    public void testCalculateAveragePostUser3() {
        //Given
        StatisticsForum forumStatistics = new StatisticsForum();
        //When
        forumStatistics.calculateAdvStatistics(initializeStatisticsMock(100, 0, 0));

        Assert.assertEquals(0, forumStatistics.getAvgPostsUser(), 0.000001);
    }

    @Test
    public void testCalculateAverageCommUser1() {
        //Given
        StatisticsForum forumStatistics = new StatisticsForum();
        //When
        forumStatistics.calculateAdvStatistics(initializeStatisticsMock(100, 1000, 0));

        Assert.assertEquals(0, forumStatistics.getAvgCommentsPost(), 0.000001);
    }

    @Test
    public void testCalculateAverageCommUser2() {
        //Given
        StatisticsForum forumStatistics = new StatisticsForum();
        //When
        forumStatistics.calculateAdvStatistics(initializeStatisticsMock(100, 1000, 907));

        Assert.assertEquals(9.07, forumStatistics.getAvgCommentsPost(), 0.000001);
    }

    @Test
    public void testCalculateAverageCommPost1() {
        //Given
        StatisticsForum forumStatistics = new StatisticsForum();
        //When
        forumStatistics.calculateAdvStatistics(initializeStatisticsMock(100, 0, 0));

        Assert.assertEquals(-1, forumStatistics.getAvgCommentsPost(), 0.000001);
    }

    @Test
    public void testCalculateAverageCommPost2() {
        //Given
        StatisticsForum forumStatistics = new StatisticsForum();
        //When
        forumStatistics.calculateAdvStatistics(initializeStatisticsMock(100, 1000, 0));

        Assert.assertEquals(0, forumStatistics.getAvgCommentsPost(), 0.000001);
    }

    @Test
    public void testCalculateAverageCommPost3() {
        //Given
        StatisticsForum forumStatistics = new StatisticsForum();
        //When
        forumStatistics.calculateAdvStatistics(initializeStatisticsMock(100, 1000, 907));

        Assert.assertEquals(0.907, forumStatistics.getAvgCommentsPost(), 0.000001);
    }

    @Test
    public void testCalculateAverageCommPost4() {
        //Given
        StatisticsForum forumStatistics = new StatisticsForum();
        //When
        forumStatistics.calculateAdvStatistics(initializeStatisticsMock(100, 1000, 1097));

        Assert.assertEquals(1.097, forumStatistics.getAvgCommentsPost(), 0.000001);
    }
}