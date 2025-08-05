package com.example;

public final class Employee {
    private final String name;
    private final Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = new Address(address.getCity(), address.getState());
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getState());
    }
}
