package com.berkay22demirel.jwtexample.controller;

import com.berkay22demirel.jwtexample.model.Book;
import com.berkay22demirel.jwtexample.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/get-all")
    public ResponseEntity<List<Book>> getAll() {
        return ResponseEntity.ok(bookService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<Book> add(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.add(book));
    }
}
