package com.example.spring_4_java25.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @GetMapping("/all")
    public ResponseEntity<String> getAllClients() {
        return ResponseEntity.ok("List of all clients");
    }



}
