package com.sisalmoxarife.backend.resources.exeptions;

import com.sisalmoxarife.backend.services.exception.NoSuchElementException;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    private ResponseEntity<StandardError> getStandardErrorResponseEntity(HttpServletRequest request, String message, HttpStatus status) {
        StandardError err = new StandardError();
        err.setTimestamp(Instant.now());
        err.setStatus(status.value());
        err.setError(message);
        err.setPath(request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<StandardError> noSuchElementException(NoSuchElementException e, HttpServletRequest request){
        return getStandardErrorResponseEntity(request, e.getMessage(), HttpStatus.NOT_FOUND);
    }
}
