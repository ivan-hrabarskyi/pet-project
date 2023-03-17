package com.peerspace.design.patterns.bridge;

public class Tv implements Device {

    private boolean isOn = false;
    private int volume = 20;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return isOn;
    }

    @Override
    public void enable() {
        isOn = true;
    }

    @Override
    public void disable() {
        isOn = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent >= 100) {
            this.volume = 100;
        } else if (percent <= 0) {
            this.volume = 0;
        } else {
            this.volume = percent;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void info() {
        System.out.println("-----------------------------------------");
        System.out.println("Tv");
        System.out.println(isOn ? "Enabled" : "Disabled");
        System.out.println("Current volume: " + (isOn ? volume : 0) + "%");
        System.out.println("Current channel: " + (isOn ? channel : 0));
        System.out.println("-----------------------------------------");
    }

}
