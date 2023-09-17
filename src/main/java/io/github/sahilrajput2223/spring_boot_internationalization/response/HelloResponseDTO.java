package io.github.sahilrajput2223.spring_boot_internationalization.response;

import org.springframework.http.HttpStatus;

public class HelloResponseDTO {

    private HttpStatus httpStatus;

    private int status;

    private String message;

    private String languageCalled;

    public HelloResponseDTO() {
    }

    public HelloResponseDTO(HttpStatus httpStatus, int status, String message, String languageCalled) {
        this.httpStatus = httpStatus;
        this.status = status;
        this.message = message;
        this.languageCalled = languageCalled;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLanguageCalled() {
        return languageCalled;
    }

    public void setLanguageCalled(String languageCalled) {
        this.languageCalled = languageCalled;
    }
}