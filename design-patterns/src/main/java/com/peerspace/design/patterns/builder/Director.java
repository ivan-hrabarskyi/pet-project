package com.peerspace.design.patterns.builder;

public class Director {

    public void createUserForLogIn(Builder builder) {
        if (builder instanceof HostBuilder) {
            builder.withUsername("ivan.hrabarskyi1@gmail.com");
            builder.withPassword("123456Qe");
            builder.withFirstName("Ivan");
            builder.withLastName("Host");
            builder.withPhoneNumber("+380951234567");
            ((HostBuilder) builder).withNumberOfListings(3);
        }
        else {
            builder.withUsername("ivan.hrabarskyiguest@gmail.com");
            builder.withPassword("123456Qe");
            builder.withFirstName("John");
            builder.withLastName("Guest");
            builder.withPhoneNumber("+380957654321");
        }
    }

    public void createUserForSignUp(Builder builder) {
        if (builder instanceof HostBuilder) {
            builder.withUsername("ivan.hrabarskyi@gmail.com");
            builder.withPassword("123456Qe");
            builder.withFirstName("John");
            builder.withLastName("Tyree");
            builder.withPhoneNumber("+380959205283");
            ((HostBuilder) builder).withNumberOfListings(0);
        }
        else {
            builder.withUsername("grabarskiy02@gmail.com");
            builder.withPassword("123456Qe");
            builder.withFirstName("Daniel");
            builder.withLastName("Harrelson");
            builder.withPhoneNumber("+380954523683");
        }
    }



}
