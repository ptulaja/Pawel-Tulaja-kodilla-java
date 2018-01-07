package com.kodilla.spring.calculator;

import com.kodilla.spring.SpringRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculationsAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result =  calculator.add(1,1);
        //Then
        Assert.assertEquals(2,result,0.0);
    }
    @Test
    public void testCalculationsSub(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result =  calculator.sub(5,5);
        //Then
        Assert.assertEquals(0,result,0.0);
    }
    @Test
    public void testCalculationsMul(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result =  calculator.mul(5,10);
        //Then
        Assert.assertEquals(50,result,0.0);
    }
    @Test
    public void testCalculationsDiv(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result =  calculator.div(10,5);
        //Then
        Assert.assertEquals(2,result,0.0);
    }
}
