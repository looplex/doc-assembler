package br.com.looplex.docassembler.exceptions.handler.document;

import br.com.looplex.docassembler.exceptions.Logger;
import br.com.looplex.docassembler.exceptions.custom.document.DocumentNotFoundException;
import br.com.looplex.docassembler.exceptions.dto.DocumentExceptionDto;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;


@RestControllerAdvice
@Order(1)
public class DocumentNotFoundHandler extends Logger {

    @ExceptionHandler(DocumentNotFoundException.class)
    public ResponseEntity<DocumentExceptionDto> handleNotFoundException(DocumentNotFoundException exception) {
        super.logException(exception);
        DocumentExceptionDto documentExceptionDto = DocumentExceptionDto
                .builder()
                .id(Long.valueOf(404))
                .error(exception.getMessage())
                .timestamp(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(documentExceptionDto);
    }

}
