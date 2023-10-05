package com.envers.enversteste.repository;

import com.envers.enversteste.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
