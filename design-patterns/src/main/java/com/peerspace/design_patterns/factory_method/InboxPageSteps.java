package com.peerspace.design_patterns.factory_method;

import com.peerspace.design_patterns.configs.FactoryMethodConfig;
import org.aeonbits.owner.ConfigFactory;

public class InboxPageSteps {

    InboxPage inboxPage;

    public void getSenderNameDisplayedInTheInboxPage() {

        FactoryMethodConfig config = ConfigFactory.create(FactoryMethodConfig.class);

        if (config.typeOfUser().equals("host")) {
            inboxPage = new InboxHostPage();
        }
        else if (config.typeOfUser().equals("guest")) {
            inboxPage = new InboxGuestPage();
        }
        else {
            throw new RuntimeException("Error! Unknown type of user.");
        }
    }

    public InboxPage getInboxPage() {
        return inboxPage;
    }
}
