package com.berkay22demirel.jwtexample.service;

import com.berkay22demirel.jwtexample.model.Book;
import com.berkay22demirel.jwtexample.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Book add(Book book) {
        return bookRepository.insert(book);
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
