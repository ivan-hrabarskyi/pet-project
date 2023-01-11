package com.peerspace.design_patterns.factory_method;

public class GuestName implements SenderName {
    @Override
    public void getSenderName() {
        System.out.println("Host name is present in Guest Inbox Page");
    }
}
