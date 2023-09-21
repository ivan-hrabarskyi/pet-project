package com.peerspace.design.patterns.decorator;

public class Host implements User {

    @Override
    public String userType() {
        return "Host";
    }

}
