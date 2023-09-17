package io.github.sahilrajput2223.spring_boot_internationalization.service;

import io.github.sahilrajput2223.spring_boot_internationalization.response.HelloResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class SpringBootInternationalizationService {

    @Autowired
    MessageSource messageSource;

    public ResponseEntity<HelloResponseDTO> getHelloMessageBasedOnLanguage(Locale locale) {
        HelloResponseDTO helloResponseDTO = new HelloResponseDTO();
        helloResponseDTO.setMessage(messageSource.getMessage("welcome.message", null, locale));
        helloResponseDTO.setLanguageCalled(messageSource.getMessage("language.file", null, locale));
        helloResponseDTO.setStatus(HttpStatus.OK.value());
        helloResponseDTO.setHttpStatus(HttpStatus.OK);
        return new ResponseEntity<>(helloResponseDTO, HttpStatus.OK);
    }
}