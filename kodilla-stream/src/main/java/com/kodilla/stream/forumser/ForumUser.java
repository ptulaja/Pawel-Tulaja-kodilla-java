package com.kodilla.stream.forumser;

import java.time.LocalDate;

public class ForumUser {

    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirthady;
    private final int postQuantity;

    public ForumUser(int userID, String userName, char sex, int year, int month, int dayOfMonth, int postQuantity) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirthady = LocalDate.of( year, month, dayOfMonth);
        this.postQuantity = postQuantity;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirthady() {
        return dateOfBirthady;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirthady=" + dateOfBirthady +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
