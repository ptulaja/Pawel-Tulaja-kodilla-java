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
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

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

        List<Item> itemList = new ArrayList<>();

        Invoice invoice = new Invoice("FV 255/322/111", itemList);

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
        productDao.save(product1);
        productDao.save(product3);
        productDao.save(product6);
        invoiceDao.save(invoice);

        //Then
        Assert.assertNotEquals(0, invoice);
        Assert.assertEquals("FV 255/322/111", invoice.getNumber());
        Assert.assertEquals("Kajzerka", product1.getName());
        Assert.assertEquals("Jogurt", product3.getName());
        Assert.assertEquals("Maslo", product6.getName());

        //CleanUp
        try {
            int product1delate = product1.getId();
            int product2delate = product2.getId();
            int product3delate = product3.getId();
            int product4delate = product4.getId();
            int product5delate = product5.getId();
            int product6delate = product6.getId();

            int item1delate = item1.getId();
            int item2delate = item2.getId();
            int item3delate = item3.getId();
            int item4delate = item4.getId();
            int item5delate = item5.getId();
            int item6delate = item6.getId();

            int invoiceId = invoice.getId();

            productDao.delete(product1delate);
            productDao.delete(product2delate);
            productDao.delete(product3delate);
            productDao.delete(product4delate);
            productDao.delete(product5delate);
            productDao.delete(product6delate);

            itemDao.delete(item1delate);
            itemDao.delete(item2delate);
            itemDao.delete(item3delate);
            itemDao.delete(item4delate);
            itemDao.delete(item5delate);
            itemDao.delete(item6delate);

            invoiceDao.delete(invoiceId);

        } catch (Exception e) {
        }
    }
}

