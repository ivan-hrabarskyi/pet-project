package com.peerspace.design_patterns.factory_method;

public class HostName implements SenderName {

    @Override
    public void getSenderName() {
        System.out.println("Guest name is present in Host Inbox page");
    }
}
