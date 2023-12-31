package com.envers.enversteste.repository;

import com.envers.enversteste.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;

public interface BookRevisionRepository extends JpaRepository<Book, Long>,
        RevisionRepository<Book, Long, Integer> {
}
