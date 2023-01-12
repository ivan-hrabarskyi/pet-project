package com.peerspace.design.patterns.abstrct.factory;

public class BetaFactory extends SpaceFactory {

    @Override
    Space getSpace(SpaceType spaceType) {
        switch (spaceType) {
            case BOOKING -> {
                return new BetaSpaceForBooking();
            }
            case COMPLETE_PROFILE -> {
                return new BetaSpaceForCompleteProfile();
            }
            default -> throw new RuntimeException("Space Type not found!");
        }
    }
}
