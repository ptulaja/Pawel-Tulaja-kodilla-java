package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Before
    public void before() {
        System.out.println("__________TEST__________ \n");
        System.out.println("\nStatus testu: ROZPOCZETY \n");
    }

    @After
    public void after() {
        System.out.println("\n__________ Status testu: ZAKONCZONY __________\n");
    }

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("Kajzerka");
        Product product2 = new Product("Pomidor");
        Product product3 = new Product("Jogurt");
        Product product4 = new Product("Papryka");
        Product product5 = new Product("Banan");
        Product product6 = new Product("Maslo");

        Item item1 = new Item(new BigDecimal(0.85), 5);
        Item item2 = new Item(new BigDecimal(1.0), 4);
        Item item3 = new Item(new BigDecimal(2.0), 2);
        Item item4 = new Item(new BigDecimal(4.0), 4);
        Item item5 = new Item(new BigDecimal(3.0), 5);
        Item item6 = new Item(new BigDecimal(8.0), 1);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product4);
        item5.setProduct(product5);
        item6.setProduct(product6);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        product4.getItems().add(item4);
        product5.getItems().add(item5);
        product6.getItems().add(item6);

        Invoice invoice = new Invoice("1");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);
        invoice.getItems().add(item6);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        item5.setInvoice(invoice);
        item6.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        System.out.println("\n__________ Wynik testu: POZYTYWNY __________\n");
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);
    }
}

