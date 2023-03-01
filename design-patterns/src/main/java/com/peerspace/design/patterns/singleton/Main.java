package com.peerspace.design.patterns.singleton;

import com.peerspace.design.patterns.singleton.enam.EnumSingleton;
import com.peerspace.design.patterns.singleton.inner.clazz.InnerClassSingleton;
import com.peerspace.design.patterns.singleton.thread.safe.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singletonOne = Singleton.getInstance("singleton value");
        Singleton singletonTwo = Singleton.getInstance("other value");

        System.out.println("singletonOne.value = " + singletonOne.getValue());
        System.out.println("singletonTwo.value = " + singletonTwo.getValue() + '\n');

        // Enum singleton


        System.out.println("EnumSingleton.getInstance().getValue() = " + EnumSingleton.getInstance().getValue());
        EnumSingleton.getInstance().setValue("singleton value");
        var enumSingletonOne = EnumSingleton.getInstance().getValue();
        System.out.println("enumSingleton1 = " + enumSingletonOne);
        EnumSingleton.getInstance().setValue("other value");
        var enumSingletonTwo = EnumSingleton.getInstance().getValue();
        System.out.println("enumSingleton2 = " + enumSingletonTwo + '\n');

        // Inner Class Singleton

        InnerClassSingleton.getInstance().setValue("singleton value");
        System.out.println("InnerClassSingleton.getInstance().getValue() = " + InnerClassSingleton.getInstance().getValue());

    }

}
