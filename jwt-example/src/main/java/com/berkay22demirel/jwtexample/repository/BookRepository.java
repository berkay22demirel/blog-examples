package com.berkay22demirel.jwtexample.repository;

import com.berkay22demirel.jwtexample.model.Book;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class BookRepository {

    private Map<Long, Book> db = new HashMap<>();

    @PostConstruct
    public void init() {
        Book book1 = new Book(1L, "The Lord of the Rings The Return of the King", "J. R. R. Tolkien", new Date());
        Book book2 = new Book(2L, "Fire and Blood", "George R. R. Martin", new Date());
        db.put(1L, book1);
        db.put(2L, book2);
    }

    public Book insert(Book book) {
        book.setId(db.size() + 1L);
        db.put(book.getId(), book);
        return book;
    }

    public List<Book> findAll() {
        return new ArrayList<>(db.values());
    }
}
