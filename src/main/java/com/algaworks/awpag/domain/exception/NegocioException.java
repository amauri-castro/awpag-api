package com.algaworks.awpag.domain.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class NegocioException extends RuntimeException{

    public NegocioException(String message) {
        super(message);
    }
}
