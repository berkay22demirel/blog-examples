package com.berkay22demirel.elasticsearchbasicexample.repository;

import com.berkay22demirel.elasticsearchbasicexample.entity.Book;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends ElasticsearchRepository<Book, String> {

    List<Book> findBookByNameLike(String search);
}
