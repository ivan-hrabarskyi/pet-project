package com.peerspace.design.patterns.decorator;

public class PushNotificationDecorator extends NotifierDecorator {

    public PushNotificationDecorator(User user) {
        super(user);
    }

    @Override
    public String userType() {
        return user.userType();
    }

    public void sendMessage(String message) {
        System.out.println("\"" + message + "\"" + " sent to " + userType() + " via Push Notifications");
    }

}
