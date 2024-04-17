package com.practice.Retrun.values.Service;

import com.practice.Retrun.values.Entity.Book;
import com.practice.Retrun.values.Model.BookRequest;

import java.util.List;
import java.util.Optional;

public interface BookService {
    public Book cerateBook(BookRequest request);
    public List<Book> getAllBook ();

    public Optional<Book> getBookById(String bookId);

    public void deleteBookById(String bookId);


}
