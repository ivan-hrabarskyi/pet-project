package com.peerspace.design.patterns.builder;

public class HostBuilder implements Builder {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    @Override
    public void withUsername(String username) {
        this.username = username;
    }

    @Override
    public void withPassword(String password) {
        this.password = password;
    }

    @Override
    public void withFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void withLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Host build() {
        return new Host(username, password, firstName, lastName, phoneNumber);
    }

}
