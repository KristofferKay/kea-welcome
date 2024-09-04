package org.example.welcome.repo;

import org.example.welcome.model.MessagesModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WelcomeRepo {
    private int id = 1;
    private List<MessagesModel> messagesModels = new ArrayList<>();


    public WelcomeRepo (){
        pop();
    }

    public List<MessagesModel> pop(){
        messagesModels.add(new MessagesModel(MessageId(), "Welcome to KEA 1"));
        messagesModels.add(new MessagesModel(MessageId(), "Welcome to KEA 2"));
        messagesModels.add(new MessagesModel(MessageId(), "Welcome to KEA 3"));
        return messagesModels;
    }

    public int MessageId(){
        return id++;
    }

    public List<MessagesModel> getAllMessages() {
        return messagesModels;
    }


    public MessagesModel findMessageById(int id) {
        for (MessagesModel m : messagesModels){
            if (m.getId() == id){
                return m;
            }
        }
        return null;
    }
}
