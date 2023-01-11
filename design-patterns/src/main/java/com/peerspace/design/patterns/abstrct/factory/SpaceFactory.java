package com.peerspace.design.patterns.abstrct.factory;

public interface SpaceFactory {

    SpaceForBooking getSpaceForBooking();
    SpaceForCompleteProfile getSpaceForCompleteProfile();

}
