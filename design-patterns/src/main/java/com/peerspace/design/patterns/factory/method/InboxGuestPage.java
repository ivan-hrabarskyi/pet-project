package com.peerspace.design.patterns.factory.method;

public class InboxGuestPage extends InboxPage {

    @Override
    SenderName getName() {
        return new HostName();
    }
}
