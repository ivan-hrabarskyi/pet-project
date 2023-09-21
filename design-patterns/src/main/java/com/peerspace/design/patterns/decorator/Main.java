package com.peerspace.design.patterns.decorator;

public class Main {

    public static void main(String[] args) {
        String message = "Time blocked from 9:30 AM to 12:30 PM";

        User user = new Host();
        NotifierDecorator notifier;

        notifier = new EmailDecorator(user);
        notifier.sendMessage(message);

        notifier = new SMSDecorator(user);
        notifier.sendMessage(message);
    }

}
