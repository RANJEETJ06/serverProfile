package com.profile.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class Controller {
    @Autowired
    MessageService messageService;
    @PostMapping("/")
    public ResponseEntity<message> createMessage(@RequestBody Map<String,String> payload){
        message mes=this.messageService.createMessage(payload.get("email"),payload.get("para"));
        return new ResponseEntity<>(mes, HttpStatus.CREATED);
    }
}
