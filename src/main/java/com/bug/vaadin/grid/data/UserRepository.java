package com.bug.vaadin.grid.data;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Repository
public class UserRepository {
    public List<User> findAll() {
        return IntStream.range(0, 10000).mapToObj(value -> new User("User " + value)).collect(Collectors.toList());
    }
}
