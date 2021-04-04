package com.berkay22demirel.elasticsearchbasicexample.controller;

import com.berkay22demirel.elasticsearchbasicexample.entity.Book;
import com.berkay22demirel.elasticsearchbasicexample.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/{search}")
    public ResponseEntity<List<Book>> search(@PathVariable String search) {
        List<Book> books = bookService.search(search);
        return ResponseEntity.ok(books);
    }
}
