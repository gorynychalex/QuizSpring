package ru.mrcpk.server.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Question {

    private Number id;
    private String text;

    public Question() {
    }

    public Question(Number id, String text) {
        this.id = id;
        this.text = text;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
