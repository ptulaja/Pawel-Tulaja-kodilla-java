package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testBigMacCheck(){

        //Given
        BigMac bigmac = BigMac.BigMacBuilder.aBigMac()
                .burgers(1)
                .roll("Zytnia")
                .sauce("1000 wysp")
                .ingredients("ser")
                .ingredients("cebula")
                .ingredients("bekon")
                .ingredients("pomidor")
                .build();
        System.out.println(bigmac);

        //When
        int howManyBurgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        String roll = bigmac.getRoll();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(1, howManyBurgers);
        Assert.assertEquals("Zytnia",roll);
        Assert.assertEquals("1000 wysp", sauce);
        Assert.assertEquals(4, howManyIngredients);
    }
}
