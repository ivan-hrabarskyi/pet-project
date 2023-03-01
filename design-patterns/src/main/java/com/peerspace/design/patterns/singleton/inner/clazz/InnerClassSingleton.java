package com.peerspace.design.patterns.singleton.inner.clazz;

public class InnerClassSingleton {

    String value;

    private InnerClassSingleton() {}

    private static class SingletonHolder {
        static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
