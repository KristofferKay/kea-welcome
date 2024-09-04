package org.example.welcome.service;

import org.example.welcome.model.MessagesModel;
import org.example.welcome.repo.WelcomeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WelcomeService {
    private final WelcomeRepo welcomeRepo;
    public WelcomeService(WelcomeRepo welcomeRepo){
        this.welcomeRepo = welcomeRepo;
    }

    public List<MessagesModel> getAllMessages(){
        return welcomeRepo.getAllMessages();
    }

    public MessagesModel findMessageById(int id, String caps){
        MessagesModel messagesModel = welcomeRepo.findMessageById(id);
        if (caps != null && caps.equals("HEY")) {
            return new MessagesModel(id, messagesModel.getText().toUpperCase());
        }
        return messagesModel;
    }

}
