package main.java.entity;


import java.util.ArrayList;
import java.util.Collection;

//done for now
public class Notes{

    private String title;
    private String content; //what is the best data object to store note contents?
    private Reminder reminder;


    public Notes(String title, String content){
        this.title = title;
        this.content = content;
        reminder = new Reminder(title, 1); //new Reminder()
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAllNotes(){
        return this.content;
    }




}