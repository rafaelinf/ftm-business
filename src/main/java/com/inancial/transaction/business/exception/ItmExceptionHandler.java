package com.inancial.transaction.business.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ItmExceptionHandler {

    private Logger log = LoggerFactory.getLogger(ItmExceptionHandler.class);

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "An error occurred while calling the service. ")
    @ExceptionHandler(ItmException.class)
    public void handlePostNotFound(HttpServletRequest request, Exception ex) {
        log.error("{} : {}", ex.getMessage(), request.getRequestURI());
    }	
}
