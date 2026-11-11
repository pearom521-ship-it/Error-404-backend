package kh.edu.istad.restfulapi.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
 public class GlobalExceptionHandler {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ApiErrorResponse<?>> handle(ResponseStatusException e) {
        ApiErrorResponse<?> body = ApiErrorResponse.builder()
                .code(e.getStatusCode().toString())
                .message(e.getReason())
                .build();
        return ResponseEntity.status(e.getStatusCode()).body(body);
    }

}