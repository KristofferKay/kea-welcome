package org.example.welcome.model;


public class MessagesModel {
    private int id;
    private String text;

    public MessagesModel(){

    }

    public MessagesModel(int id, String text){
        this.id = id;
        this.text = text;
    }

    //getter

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    //set
    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }
}
