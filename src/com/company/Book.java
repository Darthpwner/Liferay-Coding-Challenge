package com.company;

import java.util.Vector;

/**
 * Created by Darthpwner on 11/9/15.
 */
public class Book {
    Book() {
        m_books.add(book);
    }

    String getBook(int i) {
        return m_books.get(i);
    }

    int getBookVectorSize() {
        return m_books.size();
    }

    final String book = "book";

    private Vector<String> m_books = new Vector<String>();
}
