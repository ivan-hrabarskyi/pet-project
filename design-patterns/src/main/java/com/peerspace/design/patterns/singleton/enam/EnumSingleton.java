package com.peerspace.design.patterns.singleton.enam;

public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    private String value = "Enum Singleton";

    public void setValue(String stringParam) {
        this.value = stringParam;
    }

    public String getValue() {
        return this.value;
    }

}
