package com.envers.enversteste.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Getter
@Setter
@Audited
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "author")
    private String author;

    @Column(name = "title")
    private String title;
}
