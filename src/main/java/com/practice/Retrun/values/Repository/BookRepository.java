package com.practice.Retrun.values.Repository;

import com.practice.Retrun.values.Entity.Book;
import com.practice.Retrun.values.Service.BookService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,String > {
}
