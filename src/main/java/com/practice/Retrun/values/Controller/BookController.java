package com.practice.Retrun.values.Controller;

import com.practice.Retrun.values.Entity.Book;
import com.practice.Retrun.values.Model.BookRequest;
import com.practice.Retrun.values.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@ResponseBody
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private Book book;






    @PostMapping("/get")
    public ResponseEntity<Book> createBook(@RequestBody BookRequest request) {
        bookService.cerateBook(request);

        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @GetMapping("/get1")
    public List<Book> getAllBook() {
        return bookService.getAllBook();


    }

    @GetMapping("/get2/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable String bookId) {


        if (bookService.getBookById(bookId) == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }


        return ResponseEntity.of(Optional.of(book));
    }
}


