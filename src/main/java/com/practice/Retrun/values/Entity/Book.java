package com.practice.Retrun.values.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Data
@Table(name = "book-details")
@Component

public class Book {

    @Id
    @Column(name = "book-id")
    private String bookId;

    @Column(name = "book-name")
    private String bookName;

    @Column(name = "book-author")
    private String bookAuthor;
}
