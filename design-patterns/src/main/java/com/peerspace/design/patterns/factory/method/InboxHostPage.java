package com.peerspace.design.patterns.factory.method;

public class InboxHostPage extends InboxPage {

    @Override
    SenderName getName() {
        return new GuestName();
    }
}
