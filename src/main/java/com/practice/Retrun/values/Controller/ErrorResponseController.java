package com.practice.Retrun.values.Controller;

import com.practice.Retrun.values.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ErrorResponseController {
    @Autowired
    private BookService bookService;




    public ResponseEntity<ErrorResponseController> getBookById(@PathVariable String bookId){
        ErrorResponseController errorResponse = new ErrorResponseController(HttpStatus.NOT_FOUND.value());

        bookService.getBookById(bookId);
        if(bookService.getBookById(bookId) == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.status(HttpStatus.FOUND).build();


    }
}
