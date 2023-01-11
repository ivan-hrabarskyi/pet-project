package com.peerspace.design.patterns.factory.method;

public class SenderNameFactory {

    InboxPage inboxPage;

    public void getSenderNameDisplayedInTheInboxPage(UserType userType) {
        switch (userType) {
            case HOST -> inboxPage = new InboxHostPage();
            case GUEST -> inboxPage = new InboxGuestPage();
            default -> throw new RuntimeException("Error! Unknown type of user.");
        }
    }

    public InboxPage getInboxPage() {
        return inboxPage;
    }
}
