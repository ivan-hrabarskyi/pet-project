package com.peerspace.design.patterns.bridge;

public class Main {

    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new Tv());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.info();
        basicRemote.channelUp();
        basicRemote.volumeDown();
        device.info();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        basicRemote.channelUp();
        basicRemote.volumeDown();
        advancedRemote.mute();
        device.info();
    }

}
