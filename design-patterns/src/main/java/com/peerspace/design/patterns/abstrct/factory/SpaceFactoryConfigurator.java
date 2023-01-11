package com.peerspace.design.patterns.abstrct.factory;

public class SpaceFactoryConfigurator {

    private SpaceFactory spaceFactory;
    private SpaceForBooking spaceForBooking;
    private SpaceForCompleteProfile spaceForCompleteProfile;

    public static SpaceFactoryConfigurator onEnvironment(Environment env) {

        SpaceFactory spaceFactory;

        switch (env) {
            case ALPHA -> spaceFactory = new AlphaFactory();
            case BETA -> spaceFactory = new BetaFactory();
            default -> throw new RuntimeException("Error! Unknown environment");
        }

        return new SpaceFactoryConfigurator(spaceFactory);
    }

    private SpaceFactoryConfigurator(SpaceFactory spaceFactory) {
        this.spaceFactory = spaceFactory;
        this.spaceForBooking = this.spaceFactory.getSpaceForBooking();
        this.spaceForCompleteProfile = this.spaceFactory.getSpaceForCompleteProfile();
    }

    public String getSpaceIdForBooking() {
        return spaceForBooking.spaceId();
    }

    public String getListingIdForBooking() {
        return spaceForBooking.listingId();
    }

    public String getSpaceIdForCompleteProfile() {
        return spaceForCompleteProfile.spaceId();
    }

    public String getListingIdForCompleteProfile() {
        return spaceForCompleteProfile.listingId();
    }
}
