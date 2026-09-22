package org.coffeeshop.coffeeshopproject.exceptions;

import jakarta.validation.ConstraintViolationException;
import org.coffeeshop.coffeeshopproject.exceptions.exceps.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler( Exception.class )
    public final ResponseEntity<CustomException> handleAllExceptions(
            Exception ex) throws Exception {
        CustomException customException = new CustomException( HttpStatus.INTERNAL_SERVER_ERROR.value()  , "Any Issue Cause at Server" , LocalDateTime.now() , ex.getMessage() );
        return new ResponseEntity<CustomException>( customException ,HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @ExceptionHandler( {UserNotFoundException.class, NullPointerException.class })
    public ResponseEntity<CustomException> handleUserNotFoundExceptions(
            UserNotFoundException ex) throws Exception {



        CustomException customException = new CustomException( HttpStatus.NOT_FOUND.value()  , "The User is Not Available in Database" , LocalDateTime.now() ,   ex.getMessage());
        return new ResponseEntity<CustomException>( customException ,HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler( ConstraintViolationException.class )
    public final ResponseEntity<CustomException> handleValidationExceptions(
            ConstraintViolationException ex) throws Exception {

        String errorDetails = ex.getConstraintViolations()
                .stream()
                .map(cv -> cv.getPropertyPath() + " : "+ cv.getMessage())
                .collect(Collectors.joining( " , "));

        CustomException customException = new CustomException( HttpStatus.BAD_REQUEST.value()  , "Validation Failure" , LocalDateTime.now() , errorDetails );
        return new ResponseEntity<CustomException>( customException ,HttpStatus.BAD_REQUEST);
    }



}
