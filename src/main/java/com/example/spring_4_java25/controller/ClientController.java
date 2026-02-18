package com.example.spring_4_java25.controller;

import com.example.spring_4_java25.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService service;

    @GetMapping("/all")
    public ResponseEntity<String> getAllClients() {

        return ResponseEntity.ok(service.getAllClients());
    }



}
