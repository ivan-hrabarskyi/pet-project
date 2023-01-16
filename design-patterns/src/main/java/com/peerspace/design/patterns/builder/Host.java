package com.peerspace.design.patterns.builder;

public class Host {

    private final String username;
    private final String password;

    private final String firstName;
    private final String lastName;

    private final String phoneNumber;

    private int numberOfListings;

    public Host(String username, String password, String firstName, String lastName, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.numberOfListings = 0;
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

    public int getNumberOfListings() {
        return numberOfListings;
    }

    public void setNumberOfListings(int numberOfListings) {
        this.numberOfListings = numberOfListings;
    }

    public String getInfoAboutTheUser() {
        return "Host User: \n" +
                "Username: " + getUsername() + "\n" +
                "Password: " + getPassword() + "\n" +
                "First name: " + getFirstName() + "\n" +
                "Last name: " + getLastName() + "\n" +
                "Phone number: " + getPhoneNumber() + "\n" +
                "Number of listings: " + getNumberOfListings();
    }

}
