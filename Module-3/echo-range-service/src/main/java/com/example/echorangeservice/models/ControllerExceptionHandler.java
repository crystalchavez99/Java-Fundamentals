package com.example.echorangeservice.models;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

// error handler for controllers of app
@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ResponseEntity<CustomErrorResponse> handlerGenericNotFoundException(IllegalArgumentException e){
        CustomErrorResponse error = new CustomErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.toString(), e.getMessage());

        error.setStatus(HttpStatus.UNPROCESSABLE_ENTITY.value());
        error.setTimestamp(LocalDateTime.now());

        //wrap in a response entity
        ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
        return responseEntity;

    }
}
