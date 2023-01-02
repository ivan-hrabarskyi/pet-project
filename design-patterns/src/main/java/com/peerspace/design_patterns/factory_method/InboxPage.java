package com.peerspace.design_patterns.factory_method;

public abstract class InboxPage {

    public void render() {
        SenderName senderName = getName();
        senderName.getSenderName();
    }

    abstract SenderName getName();

}
