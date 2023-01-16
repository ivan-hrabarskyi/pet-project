package com.peerspace.design.patterns.builder;

public interface Builder {

    void withUsername(String username);
    void withPassword(String password);
    void withFirstName(String firstName);
    void withLastName(String lastName);
    void withPhoneNumber(String phoneNumber);

}
