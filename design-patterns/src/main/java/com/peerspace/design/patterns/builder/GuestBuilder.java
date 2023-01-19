package com.peerspace.design.patterns.builder;

public class GuestBuilder extends Builder {

    public Guest build() {
        return new Guest(username, password, firstName, lastName, phoneNumber);
    }

}
