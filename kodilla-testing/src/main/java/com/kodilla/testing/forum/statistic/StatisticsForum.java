package com.kodilla.testing.forum.statistic;

public class StatisticsForum {

    public int usersQuantity;
    public int postsQunatity;
    public int commentsQuantity;
    public double avgPostsUser;
    public double avgCommentsUser;
    public double avgCommentsPost;

    public void calculateAdvStatistics(Statistics statistics) {

        usersQuantity = statistics.usersNames().size();
        postsQunatity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        avgPostsUser = (double) postsQunatity / usersQuantity;
        avgCommentsUser = (double) commentsQuantity / usersQuantity;
        avgCommentsPost = (double) commentsQuantity / postsQunatity;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQunatity() {
        return postsQunatity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAvgPostsUser() {
        return avgPostsUser;
    }

    public double getAvgCommentsUser() {
        return avgCommentsUser;
    }

    public double getAvgCommentsPost() {
        return avgCommentsPost;
    }
}
