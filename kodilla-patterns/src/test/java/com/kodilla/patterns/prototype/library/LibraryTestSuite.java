package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("Biblioteka ksiazek");

        Book book1 = new Book("Tytul1", "Autor1", LocalDate.of(2000,1,1));
        Book book2 = new Book("Tytul2", "Autor2", LocalDate.of(2000,1,2));
        Book book3 = new Book("Tytul3", "Autor3", LocalDate.of(2000,1,3));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Biblioteka - plytkie klonowanie");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka - glebokie klonowanie");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
