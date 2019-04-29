package com.bug.vaadin.grid.data;

import java.util.UUID;

public class User {
    private String id = UUID.randomUUID().toString();
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
