package com.peerspace.design.patterns.abstrct.factory;

public class AlphaFactory extends SpaceFactory {

    @Override
    Space getSpace(SpaceType spaceType) {
        switch (spaceType) {
            case BOOKING -> {
                return new AlphaSpaceForBooking();
            }
            case COMPLETE_PROFILE -> {
                return new AlphaSpaceForCompleteProfile();
            }
            default -> throw new RuntimeException("Space Type not found!");
        }
    }
}
