package com.peerspace.design.patterns.decorator;

public abstract class NotifierDecorator implements User {

    protected User user;

    public NotifierDecorator(User user) {
        this.user = user;
    }

    public void sendMessage(String message) {
        System.out.println("\"" + message + "\"" + " sent to " + userType());
    }

}
