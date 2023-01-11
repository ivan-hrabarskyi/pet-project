package com.peerspace.design.patterns.abstrct.factory;

public class AlphaFactory implements SpaceFactory {

    @Override
    public SpaceForBooking getSpaceForBooking() {
        return new AlphaSpaceForBooking();
    }

    @Override
    public SpaceForCompleteProfile getSpaceForCompleteProfile() {
        return new AlphaSpaceForCompleteProfile();
    }

}
