package com.envers.enversteste.controller;

import com.envers.enversteste.model.Book;
import com.envers.enversteste.repository.BookRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        if(book.getId() != null) {
            throw new IllegalArgumentException("The ID will be set by the database!");
        }
        return bookRepository.save(book);
    }

}
