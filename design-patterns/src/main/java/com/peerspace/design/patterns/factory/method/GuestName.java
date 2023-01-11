package com.peerspace.design.patterns.factory.method;

public class GuestName implements SenderName {
    @Override
    public void getSenderName() {
        System.out.println("Guest name is present in Host Inbox Page");
    }
}
