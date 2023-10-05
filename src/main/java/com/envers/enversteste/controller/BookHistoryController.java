package com.envers.enversteste.controller;

import com.envers.enversteste.model.Book;
import com.envers.enversteste.repository.BookRevisionRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.history.Revision;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book-history")
@AllArgsConstructor
public class BookHistoryController {

    private final BookRevisionRepository bookRevisionRepository;

    @GetMapping("/revisions/{id}")
    public List<Book> getBookRevisions(@PathVariable Long id) {
        bookRevisionRepository
                .findRevisions(id)
                .stream()
                .map(Revision::getEntity)
                .toList();
    }
}