package com.peerspace.design.patterns.builder;

public abstract class Builder {

    protected String username;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;

    public void withUsername(String username) {
        this.username = username;
    }

    public void withPassword(String password) {
        this.password = password;
    }

    public void withFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void withLastName(String lastName) {
        this.lastName = lastName;
    }

    public void withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
