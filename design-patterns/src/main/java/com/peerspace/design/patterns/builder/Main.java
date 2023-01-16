package com.peerspace.design.patterns.builder;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        HostBuilder hostBuilder = new HostBuilder();
        director.createUserForLogIn(hostBuilder);

        Host host = hostBuilder.build();
        host.setNumberOfListings(3);
        System.out.println(host.getInfoAboutTheUser());

        GuestBuilder guestBuilder = new GuestBuilder();
        director.createUserForSignUp(guestBuilder);

        Guest guest = guestBuilder.build();
        System.out.println(guest.getInfoAboutTheUser());
    }

}
