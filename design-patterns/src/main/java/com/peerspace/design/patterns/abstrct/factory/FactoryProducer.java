package com.peerspace.design.patterns.abstrct.factory;

public class FactoryProducer {

    public static SpaceFactory getFactory(Environment env) {

        SpaceFactory spaceFactory;

        switch (env) {
            case ALPHA -> spaceFactory = new AlphaFactory();
            case BETA -> spaceFactory = new BetaFactory();
            default -> throw new RuntimeException("Error! Unknown environment");
        }

        return spaceFactory;
    }
}
