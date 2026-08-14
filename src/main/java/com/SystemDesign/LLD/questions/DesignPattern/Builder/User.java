package com.SystemDesign.LLD.questions.DesignPattern.Builder;

public class User {
    private final String firstName;
    private final String lastName;
    private final String email;

    private final String phone;
    private final String address;
    private final Integer age;
    private final String company;

    private User(String firstName, String lastName, String email, String phone, String address, Integer age, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.age = age;
        this.company = company;
    }
}
