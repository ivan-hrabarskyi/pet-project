package com.peerspace.design.patterns.builder;

public class Guest {

    private final String username;
    private final String password;

    private final String firstName;
    private final String lastName;

    private final String phoneNumber;

    public Guest(String username, String password, String firstName, String lastName, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getInfoAboutTheUser() {
        return "Guest User: \n" +
                "Username: " + getUsername() + "\n" +
                "Password: " + getPassword() + "\n" +
                "First name: " + getFirstName() + "\n" +
                "Last name: " + getLastName() + "\n" +
                "Phone number: " + getPhoneNumber();
    }
}
