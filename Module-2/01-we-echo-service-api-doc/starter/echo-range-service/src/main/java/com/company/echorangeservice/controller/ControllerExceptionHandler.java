package com.company.echorangeservice.controller;

import com.company.echorangeservice.models.CustomErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerExceptionHandler {

        @ExceptionHandler(value = IllegalArgumentException.class)
        @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
        public ResponseEntity<CustomErrorResponse> handleGenericNotFoundException(IllegalArgumentException e) {
            CustomErrorResponse error = new CustomErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.toString(), e.getMessage());
            error.setStatus((HttpStatus.UNPROCESSABLE_ENTITY.value()));
            error.setTimestamp(LocalDateTime.now());
            ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
            return responseEntity;
        }
}
