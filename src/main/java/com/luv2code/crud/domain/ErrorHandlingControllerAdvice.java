package com.luv2code.crud.domain;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.URI;

import static java.text.MessageFormat.format;

@ControllerAdvice
public class ErrorHandlingControllerAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorHandlingControllerAdvice.class);

    @ExceptionHandler
    public ProblemDetail handle(IllegalStateException illegalStateException, HttpServletRequest request) {
        LOGGER.error("Error happens at [{}] because user's full name is not accepted", request.getServletPath());
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
        problemDetail.setDetail(format(illegalStateException.getMessage()));
        problemDetail.setInstance(URI.create("about:blank"));
        return problemDetail;
    }
}
