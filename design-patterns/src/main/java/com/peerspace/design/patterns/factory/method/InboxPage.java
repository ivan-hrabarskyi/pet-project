package com.peerspace.design.patterns.factory.method;

public abstract class InboxPage {

    public void render() {
        SenderName senderName = getName();
        senderName.getSenderName();
    }

    abstract SenderName getName();

}
