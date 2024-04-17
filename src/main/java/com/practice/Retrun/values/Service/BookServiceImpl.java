package com.practice.Retrun.values.Service;

import com.practice.Retrun.values.Entity.Book;
import com.practice.Retrun.values.Model.BookRequest;
import com.practice.Retrun.values.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public Book cerateBook(BookRequest request) {
        Book book =new Book();
        book.setBookId(UUID.randomUUID().toString());
        book.setBookName(request.getBookName());
        book.setBookAuthor(request.getBookAuthor());
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(String bookId) {
        return bookRepository.findById(bookId);
    }

    @Override
    public void deleteBookById(String bookId) {

    }
}
