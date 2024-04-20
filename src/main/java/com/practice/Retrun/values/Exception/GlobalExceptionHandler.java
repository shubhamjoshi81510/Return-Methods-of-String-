package com.practice.Retrun.values.Exception;

import com.practice.Retrun.values.Model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> bookNOtFoundException(NotFoundException exception) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(), exception.getMessage(), Instant.now().toEpochMilli());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

}
    @ExceptionHandler(NotFoundException.BadRequestException.class)
    public ResponseEntity<ErrorResponse> bookIdNotValidException(NotFoundException.BadRequestException exception) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), exception.getMessage(), Instant.now().toEpochMilli());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
