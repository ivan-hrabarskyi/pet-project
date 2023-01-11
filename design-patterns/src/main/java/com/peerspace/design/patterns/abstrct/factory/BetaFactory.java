package com.peerspace.design.patterns.abstrct.factory;

public class BetaFactory implements SpaceFactory {

    @Override
    public SpaceForBooking getSpaceForBooking() {
        return new BetaSpaceForBooking();
    }

    @Override
    public SpaceForCompleteProfile getSpaceForCompleteProfile() {
        return new BetaSpaceForCompleteProfile();
    }

}
