package com.kodilla.jdbc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

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
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        System.out.println("-> POLACZENIE AKTYWNE <-");
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT USERS.FIRSTNAME, USERS.LASTNAME, COUNT(*) AS POSTS_NO " +
                "FROM USERS, POSTS " +
                "WHERE USERS.ID = POSTS.USER_ID " +
                "GROUP BY USERS.ID " +
                "HAVING COUNT(*)>=2;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (resultSet.next()){
            System.out.println(resultSet.getString("FIRSTNAME") + ", " +
                    resultSet.getString("LASTNAME") + ", " +
                    resultSet.getString("POSTS_NO"));
            counter++;
        }
        resultSet.close();
        statement.close();
        Assert.assertEquals(2,counter);
    }
}
