package com.bug.vaadin.grid.data;

import java.util.UUID;

public class Address {
    private String id = UUID.randomUUID().toString();
    private String address;

    public Address(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
}
