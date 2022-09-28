package com.example.restservice;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(final long id, String content) {
        this.id = id;
        this.content = content;
    }

    public final long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
