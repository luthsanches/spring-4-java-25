package com.example.spring_4_java25.service.impl;

import com.example.spring_4_java25.service.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {


    @Override
    public String getAllClients() {
        return "Service para all clients";
    }
}
