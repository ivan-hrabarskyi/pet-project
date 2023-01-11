package com.peerspace.design.patterns.abstrct.factory;

public class Main {

    public static void main(String[] args) {
        var spaces = SpaceFactoryConfigurator.onEnvironment(Environment.ALPHA);
        System.out.println(spaces.getListingIdForBooking());
        System.out.println(spaces.getSpaceIdForBooking());
        System.out.println(spaces.getListingIdForCompleteProfile());
        System.out.println(spaces.getSpaceIdForCompleteProfile());
    }

}
