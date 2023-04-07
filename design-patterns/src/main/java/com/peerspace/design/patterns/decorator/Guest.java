package com.peerspace.design.patterns.decorator;

public class Guest implements User {

    @Override
    public String userType() {
        return "Guest";
    }

}
