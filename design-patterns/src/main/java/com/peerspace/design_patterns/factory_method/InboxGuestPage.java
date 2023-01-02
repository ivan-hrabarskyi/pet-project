package com.peerspace.design_patterns.factory_method;

public class InboxGuestPage extends InboxPage {

    @Override
    SenderName getName() {
        return new GuestName();
    }
}
