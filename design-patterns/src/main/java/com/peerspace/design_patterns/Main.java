package com.peerspace.design_patterns;

import com.peerspace.design_patterns.factory_method.InboxPageSteps;

public class Main {

    public static void main(String[] args) {
        InboxPageSteps inboxPage = new InboxPageSteps();
        inboxPage.getSenderNameDisplayedInTheInboxPage();

        inboxPage.getInboxPage().render();

    }
}