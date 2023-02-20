package com.peerspace.design.patterns.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singletonOne = Singleton.getInstance("singleton value");
        Singleton singletonTwo = Singleton.getInstance("other value");

        System.out.println("singletonOne.value = " + singletonOne.getValue());
        System.out.println("singletonTwo.value = " + singletonTwo.getValue());
    }

}
