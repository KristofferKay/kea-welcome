package org.example.welcome.controller;


import org.example.welcome.model.MessagesModel;
import org.example.welcome.service.WelcomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("api/v1/welcome")
public class WelcomeController {
    private final WelcomeService welcomeService;


    public WelcomeController(WelcomeService welcomeService){
        this.welcomeService = welcomeService;
    }

    @GetMapping("")
    public ResponseEntity<List<MessagesModel>> getALlMessages(){
        List<MessagesModel> messagesModels = welcomeService.getAllMessages();
        return new ResponseEntity<>(messagesModels, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MessagesModel> getALlMessages(@PathVariable int id, @RequestParam(required = false) String caps){
        MessagesModel messagesModels = welcomeService.findMessageById(id, caps);
        return new ResponseEntity<>(messagesModels, HttpStatus.OK);
    }



}
