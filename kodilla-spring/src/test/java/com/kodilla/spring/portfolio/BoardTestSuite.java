package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("Przygotowanie do realizacji");
        board.getToDoList().getTasks().add("Przygotowanie do realizacji - poz 1");
        board.getInProgressList().getTasks().add("W trakcie realizacji");
        board.getDoneList().getTasks().add("Realizacja zakonczona");

        //Then
        Assert.assertEquals("Przygotowanie do realizacji",  board.getToDoList().getTasks().get(0));
        System.out.println(board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Przygotowanie do realizacji - poz 1",  board.getToDoList().getTasks().get(1));
        System.out.println(board.getToDoList().getTasks().get(1));
        Assert.assertEquals("W trakcie realizacji", board.getInProgressList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Realizacja zakonczona", board.getDoneList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
    }
}
