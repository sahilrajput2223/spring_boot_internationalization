package io.github.sahilrajput2223.spring_boot_internationalization.controller;

import io.github.sahilrajput2223.spring_boot_internationalization.service.SpringBootInternationalizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootInternationalizationController {

    @Autowired
    SpringBootInternationalizationService springBootInternationalizationService;

    @GetMapping(value = "/api/user/hello")
    public ResponseEntity getHelloMessageBasedOnLanguage() {
        return springBootInternationalizationService.getHelloMessageBasedOnLanguage();
    }
}