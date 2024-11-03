package org.example.building;

import org.example.library.Book;

public class House {
    House(){
        Book book = new Book();
        book.printBook();
        String val = book.isbn;
    }
}
