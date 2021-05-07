package com.berkay22demirel.elasticsearchbasicexample.service;

import com.berkay22demirel.elasticsearchbasicexample.entity.Book;
import com.berkay22demirel.elasticsearchbasicexample.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    @PostConstruct
    public void init() {
        //Book book1 = new Book("B00000001","Lord of the Rings", "J. R. R. Tolkien", Calendar.getInstance().getTime());
        //Book book2 = new Book("B00000002","Hobbit", "J. R. R. Tolkien", Calendar.getInstance().getTime());
        //Book book3 = new Book("B00000003","Game of Thrones", "George R. R. Martin", Calendar.getInstance().getTime());
        //bookRepository.save(book1);
        //bookRepository.save(book2);
        //bookRepository.save(book3);
    }

    public List<Book> search(String search) {
        return bookRepository.findBookByNameLike(search);
    }
}
