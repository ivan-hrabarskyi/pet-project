package com.peerspace.design_patterns.factory_method;

public class InboxHostPage extends InboxPage {

    @Override
    SenderName getName() {
        return new HostName();
    }
}
