package io.github.sahilrajput2223.spring_boot_internationalization.service;

import io.github.sahilrajput2223.spring_boot_internationalization.response.HelloResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SpringBootInternationalizationService {
    public ResponseEntity<HelloResponseDTO> getHelloMessageBasedOnLanguage() {
        HelloResponseDTO helloResponseDTO = new HelloResponseDTO();
        helloResponseDTO.setMessage("Hello (In English)");
        helloResponseDTO.setLanguageCalled("en");
        helloResponseDTO.setStatus(HttpStatus.OK.value());
        helloResponseDTO.setHttpStatus(HttpStatus.OK);
        return new ResponseEntity(helloResponseDTO, HttpStatus.OK);
    }
}