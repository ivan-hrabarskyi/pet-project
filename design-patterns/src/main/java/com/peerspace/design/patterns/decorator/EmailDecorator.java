package com.peerspace.design.patterns.decorator;

public class EmailDecorator extends NotifierDecorator {

    public EmailDecorator(User user) {
        super(user);
    }

    @Override
    public String userType() {
        return user.userType();
    }

    public void sendMessage(String message) {
        System.out.println("\"" + message + "\"" + " sent to " + userType() + " via Email");
    }

}
