package com.bug.vaadin.grid.data;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Repository
public class AddressRepository {
    public List<Address> findAll() {
        return IntStream.range(0, 10000).mapToObj(value -> new Address("Address " + value)).collect(Collectors.toList());
    }
}
