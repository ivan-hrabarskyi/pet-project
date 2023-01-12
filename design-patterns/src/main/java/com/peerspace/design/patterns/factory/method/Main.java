package com.peerspace.design.patterns.factory.method;

public class Main {

    public static void main(String[] args) {
        SenderNameFactory inboxPage = new SenderNameFactory();
        inboxPage.getSenderNameDisplayedInTheInboxPage(UserType.GUEST);

        inboxPage.getInboxPage().render();

    }
}