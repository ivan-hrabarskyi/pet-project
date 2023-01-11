package com.peerspace.design.patterns;

import com.peerspace.design.patterns.factory.method.SenderNameFactory;
import com.peerspace.design.patterns.factory.method.UserType;

public class Main {

    public static void main(String[] args) {
        SenderNameFactory inboxPage = new SenderNameFactory();
        inboxPage.getSenderNameDisplayedInTheInboxPage(UserType.GUEST);

        inboxPage.getInboxPage().render();

    }
}