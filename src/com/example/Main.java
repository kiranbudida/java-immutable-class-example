package com.example;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Noida", "Uttar Pradesh");
        Employee employee = new Employee("John", address);

        //modifying the original address
        address.setCity("Lucknow");

        //Output remains unchanged due to defensive copy
        System.out.println(employee.getAddress().getCity()); //outputs: Noida
    }
}
