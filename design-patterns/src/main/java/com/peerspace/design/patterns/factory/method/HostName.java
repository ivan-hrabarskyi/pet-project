package com.peerspace.design.patterns.factory.method;

public class HostName implements SenderName {

    @Override
    public void getSenderName() {
        System.out.println("Host name is present in Guest Inbox page");
    }
}
