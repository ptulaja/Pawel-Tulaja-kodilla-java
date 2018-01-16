package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User user1 = new Millenials("Millenials");
        User user2 = new YGeneration("YGeneration");
        User user3 = new ZGeneration("ZGeneration");

        //When
        String user1Preferences = user1.sharePost();
        System.out.println("User1: " + user1Preferences);

        String user2Preferences = user2.sharePost();
        System.out.println("User2: " + user2Preferences);

        String user3Preferences = user3.sharePost();
        System.out.println("User3: " + user3Preferences);

        //Then
        Assert.assertEquals("Facebook",user1Preferences);
        Assert.assertEquals("Snapchat", user2Preferences);
        Assert.assertEquals("Twitter", user3Preferences);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User user3 = new ZGeneration("ZGeneration");

        //When
        String user3ShallUse = user3.sharePost();
        System.out.println("User 3 przypisany do przypadku testowego: " + user3ShallUse);

        user3.setSocialPublisher(new SnapchatPublisher());
        user3ShallUse = user3.sharePost();
        System.out.println("User 3 zmiania przypisanie przypadku testowego na: " + user3ShallUse );

        //Then
        Assert.assertEquals("Snapchat", user3ShallUse);
    }
}
