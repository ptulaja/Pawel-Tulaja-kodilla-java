package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void openLoggerFiles() {
        Logger.getInstance().log("Log - 1");
    }

    @Test
    public void getLastLogTest(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Log - 1", lastLog);
    }
}
