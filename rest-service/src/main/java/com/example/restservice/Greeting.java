package com.example.restservice;

public class Greeting {

    private final_long id;
    private final String content;

    public Greeting(final_long id, String content) {
        this.id = id;
        this.content = content;
    }

    public final_long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
