package com.peerspace.design.patterns.builder;

public class HostBuilder extends Builder {

    private int numberOfListings;

    public void withNumberOfListings(int numberOfListings) {
        this.numberOfListings = numberOfListings;
    }

    public Host build() {
        return new Host(username, password, firstName, lastName, phoneNumber, numberOfListings);
    }

}
