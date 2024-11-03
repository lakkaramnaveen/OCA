package org.example.building;

import org.example.library.Book;

public class StoryBook extends Book {
    public StoryBook(){
        Book book = new Book();
        // book.author; won't work
        /*A derived class in a separate
        package can’t access protected members of its base class using reference
        variables. */

        String va = author;
        modifyTemplate();
    }
}
