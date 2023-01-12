package com.peerspace.design.patterns.abstrct.factory;

public class Main {

    public static void main(String[] args) {
        SpaceFactory alphaSpaceFactory = FactoryProducer.getFactory(Environment.ALPHA);
        var alphaSpaceForBooking = alphaSpaceFactory.getSpace(SpaceType.BOOKING);
        System.out.println(alphaSpaceForBooking.spaceId());
        System.out.println(alphaSpaceForBooking.listingId());
        var alphaSpaceForCompleteProfile = alphaSpaceFactory.getSpace(SpaceType.COMPLETE_PROFILE);
        System.out.println(alphaSpaceForCompleteProfile.spaceId());
        System.out.println(alphaSpaceForCompleteProfile.listingId());

        SpaceFactory betaSpaceFactory = FactoryProducer.getFactory(Environment.BETA);
        var betaSpaceForBooking = betaSpaceFactory.getSpace(SpaceType.BOOKING);
        System.out.println(betaSpaceForBooking.spaceId());
        System.out.println(betaSpaceForBooking.listingId());
        var betaSpaceForCompleteProfile = betaSpaceFactory.getSpace(SpaceType.COMPLETE_PROFILE);
        System.out.println(betaSpaceForCompleteProfile.spaceId());
        System.out.println(betaSpaceForCompleteProfile.listingId());

    }

}
