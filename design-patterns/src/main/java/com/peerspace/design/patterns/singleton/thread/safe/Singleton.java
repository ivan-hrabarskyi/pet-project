package com.peerspace.design.patterns.singleton.thread.safe;

public class Singleton {

    private static volatile Singleton instance;
    private static Object mutex = new Object();
    private String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton localRef = instance;
        if (localRef == null) {
            synchronized (mutex) {
                localRef = instance;
                if (localRef == null) {
                    instance = localRef = new Singleton(value);

                }
            }
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

}
